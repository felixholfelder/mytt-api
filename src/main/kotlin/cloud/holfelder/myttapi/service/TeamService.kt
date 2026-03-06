package cloud.holfelder.myttapi.service

import cloud.holfelder.myttapi.client.TeamClient
import cloud.holfelder.myttapi.model.Team
import org.springframework.stereotype.Service

@Service
class TeamService(val teamClient: TeamClient) {
    fun getTeamsByClubId(clubId: String, organization: String): List<Team> {
        val result = teamClient.getTeams(clubId, organization)
        if (result.data == null)
            return emptyList()

        return result.data.map { it.toModel() }
    }
}