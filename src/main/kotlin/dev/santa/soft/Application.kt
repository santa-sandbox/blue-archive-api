package dev.santa.soft

import dev.santa.soft.plugins.configureHTTP
import dev.santa.soft.plugins.configureInjection
import dev.santa.soft.plugins.configureMonitoring
import dev.santa.soft.plugins.configureRouting
import dev.santa.soft.plugins.configureSerialization
import io.ktor.server.application.Application

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureInjection()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
}
