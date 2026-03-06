package cloud.holfelder.myttapi.web

import cloud.holfelder.myttapi.model.GameSchedule
import cloud.holfelder.myttapi.model.Team
import cloud.holfelder.myttapi.service.GameScheduleService
import cloud.holfelder.myttapi.service.TeamService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/club")
class ClubController(val gameScheduleService: GameScheduleService, val teamService: TeamService) {
    @GetMapping("game-schedule")
    fun getGameScheduleForClub(@RequestParam teamId: String?): GameSchedule {
        return gameScheduleService.getGameSchedule(teamId)
    }

    @GetMapping("{clubId}/teams")
    fun getTeamsByClubId(@PathVariable clubId: String, @RequestParam("organization") organization: String = "ByTTV"): List<Team> {
        return teamService.getTeamsByClubId(clubId, organization)
    }
}
