package cloud.holfelder.myttapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyttApiApplication

fun main(args: Array<String>) {
    runApplication<MyttApiApplication>(*args)
}
