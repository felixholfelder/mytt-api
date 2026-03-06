package cloud.holfelder.myttapi.service

import cloud.holfelder.myttapi.client.TeamClient
import cloud.holfelder.myttapi.model.Team
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class TeamService(val teamClient: TeamClient) {
    fun getTeamsByClubId(clubId: String, organization: String): List<Team> {
        val result = teamClient.getTeams(clubId, organization)
        if (result.data == null)
             throw ResponseStatusException(HttpStatus.NOT_FOUND, "No data found for clubId $clubId and organization $organization")

        return result.data.map { it.toModel() }
    }
}