package soft.santa.dev.modules

import org.koin.dsl.module
import soft.santa.dev.repo.StudentRepository
import soft.santa.dev.services.StudentService
import soft.santa.dev.services.StudentServiceImpl

val studentModule = module {
    single { StudentRepository(get()) }
    single { StudentServiceImpl(get()) as StudentService }
}
