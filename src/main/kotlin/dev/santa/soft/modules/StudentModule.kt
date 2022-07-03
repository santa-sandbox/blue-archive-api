package dev.santa.soft.modules

import dev.santa.soft.repo.StudentRepository
import dev.santa.soft.services.StudentService
import dev.santa.soft.services.StudentServiceImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val studentModule = module {
    singleOf(::StudentRepository)
    singleOf(::StudentServiceImpl) { bind<StudentService>() }
}
