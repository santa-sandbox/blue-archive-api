package dev.santa.soft.plugins

import dev.santa.soft.modules.mongoModule
import dev.santa.soft.modules.studentModule
import io.ktor.server.application.Application
import io.ktor.server.application.install
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureInjection() {
    install(Koin) {
        slf4jLogger()
        modules(mongoModule, studentModule)
    }
}