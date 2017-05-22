package com.fef.sis.service

import com.fef.sis.model.Users
import com.fef.sis.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by fef on 22/5/17.
 */
@Service
class UsersService {

    @Autowired
    lateinit var userRepository: UsersRepository

    fun searchByUserName(name: String) = userRepository.findByUserName(name)
}