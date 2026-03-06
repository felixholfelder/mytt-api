package cloud.holfelder.myttapi.client

import cloud.holfelder.myttapi.entity.TeamEntity
import cloud.holfelder.myttapi.entity.TeamResultEntity
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(
  name = "team-client",
  url = "https://mytischtennis.de/api/ttr/teams",
)
interface TeamClient {
  @GetMapping
  fun getTeams(@RequestParam clubNumber: String, @RequestParam organization: String): TeamResultEntity
}