package cloud.holfelder.myttapi.service

import cloud.holfelder.myttapi.client.GameScheduleClient
import cloud.holfelder.myttapi.model.GameSchedule
import org.springframework.stereotype.Service

@Service
class GameScheduleService(val gameScheduleClient: GameScheduleClient) {
    fun getGameSchedule(teamId: String?): GameSchedule {
        if (teamId == null) {
            return GameSchedule("no team")
        }

        return GameSchedule(teamId)
    }
}