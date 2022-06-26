package soft.santa.dev.modules

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import soft.santa.dev.repo.StudentRepository
import soft.santa.dev.services.StudentService
import soft.santa.dev.services.StudentServiceImpl

val studentModule = module {
    singleOf(::StudentRepository)
    singleOf(::StudentServiceImpl) { bind<StudentService>() }
}
