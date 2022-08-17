package dev.santa.soft.schedules.job

import dev.santa.soft.services.StudentService
import org.koin.java.KoinJavaComponent.inject
import org.quartz.Job
import org.quartz.JobExecutionContext

class StudentJob : Job {
    val studentService: StudentService by inject(StudentService::class.java)
    override fun execute(context: JobExecutionContext?) {
        // todo: load json from link
        // todo: check sha256 hash for not to update if matched
        // todo: flush all data on remote mongo-database instance
        // studentService.deleteAll()
        // todo: push json data into mongo-database
    }
}
