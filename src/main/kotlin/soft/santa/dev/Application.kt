package soft.santa.dev

import io.ktor.server.application.Application
import org.koin.core.context.startKoin
import soft.santa.dev.modules.mongoModule
import soft.santa.dev.modules.studentModule
import soft.santa.dev.plugins.configureHTTP
import soft.santa.dev.plugins.configureMonitoring
import soft.santa.dev.plugins.configureRouting
import soft.santa.dev.plugins.configureSerialization

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    startKoin {
        modules(mongoModule, studentModule)
    }
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
}
