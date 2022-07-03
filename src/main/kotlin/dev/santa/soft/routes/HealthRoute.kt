package dev.santa.soft.routes

import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import java.util.Properties

fun Route.checkHealthRoute() {
    get("/health") {
        call.respondText("OK")
    }
}

fun Route.appInfoRoute() {
    get("/info") {
        val versionProperties = object {}.javaClass.classLoader.getResourceAsStream("version.properties").use {
            Properties().apply { load(it) }
        }
        call.respondText { versionProperties.getProperty("version") }
    }
}
