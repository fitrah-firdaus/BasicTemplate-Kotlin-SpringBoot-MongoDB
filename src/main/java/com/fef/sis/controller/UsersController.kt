package com.fef.sis.controller

import com.fef.sis.service.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by fef on 22/5/17.
 */
@RestController
class UsersController {

    @Autowired
    lateinit var usersService: UsersService

    @GetMapping("/{name}")
    fun searchByUserName(@PathVariable name: String) = usersService.searchByUserName(name)
}