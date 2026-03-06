package cloud.holfelder.myttapi.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
  name = "ttrClient",
  url = "https://mytischtennis.de/api"
)
interface GameScheduleClient {
  @GetMapping
  fun sendNotification(): String
}