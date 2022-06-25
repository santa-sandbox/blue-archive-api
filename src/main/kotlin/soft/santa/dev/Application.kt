package soft.santa.dev

import io.ktor.server.application.Application
import soft.santa.dev.plugins.configureHTTP
import soft.santa.dev.plugins.configureMonitoring
import soft.santa.dev.plugins.configureRouting
import soft.santa.dev.plugins.configureSerialization

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
}
