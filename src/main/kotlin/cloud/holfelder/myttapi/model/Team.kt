package cloud.holfelder.myttapi.model

data class Team(
    val season: String,
    val teamId: String,
    val groupId: String,
    val teamName: String,
    val pointsWon: String,
    val tableRank: String,
    val leagueName: String,
    val pointsLost: String,
    val teamOrganisationShort: String,
)
