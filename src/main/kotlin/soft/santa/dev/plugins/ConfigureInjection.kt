package soft.santa.dev.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger
import soft.santa.dev.modules.mongoModule
import soft.santa.dev.modules.studentModule

fun Application.configureInjection() {
    install(Koin) {
        slf4jLogger()
        modules(mongoModule, studentModule)
    }
}
