package cloud.holfelder.myttapi.entity

import cloud.holfelder.myttapi.model.Team

data class TeamResultEntity(val data: List<TeamEntity>, val error: String?)

data class TeamEntity(
    val season: String,
    val team_id: String,
    val group_id: String,
    val team_name: String,
    val points_won: String,
    val table_rank: String,
    val league_name: String,
    val points_lost: String,
    val team_organisation_short: String,
) {
    fun toModel() = Team(
        season = season,
        teamId = team_id,
        groupId = group_id,
        teamName = team_name,
        pointsWon = points_won,
        tableRank = table_rank,
        leagueName = league_name,
        pointsLost = points_lost,
        teamOrganisationShort = team_organisation_short,
    )
}