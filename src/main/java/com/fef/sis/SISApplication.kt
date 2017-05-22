package com.fef.sis

import com.fef.sis.model.Users
import com.fef.sis.repository.UsersRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 * Created by fef on 21/5/17.
 */
@SpringBootApplication
open class SISApplication {
    @Bean
    open fun init(repository: UsersRepository) = CommandLineRunner{
        repository.save(Users("FEF","FEF",1))
        repository.save(Users("FEF2","FEF2",2))
    }
}

fun main(args: Array<String>){
    SpringApplication.run(SISApplication::class.java, *args)
}