package com.fef.sis.repository

import com.fef.sis.model.Users
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by fef on 21/5/17.
 */
interface UsersRepository : MongoRepository<Users,Long> {
    fun findByUserName(name: String): List<Users>
}