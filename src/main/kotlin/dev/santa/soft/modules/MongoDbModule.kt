package dev.santa.soft.modules

import com.typesafe.config.ConfigFactory
import io.ktor.server.config.HoconApplicationConfig
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mongoModule = module(createdAtStart = true) {
    val mongoUri = HoconApplicationConfig(ConfigFactory.load()).property("mongo.uri").getString()
    factory { KMongo.createClient(mongoUri).coroutine }
}
