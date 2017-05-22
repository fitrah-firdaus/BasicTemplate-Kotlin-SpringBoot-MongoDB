package com.fef.sis.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by fef on 21/5/17.
 */
@Document(collection = "users")
data class Users @PersistenceConstructor constructor(var userName: String,
                                                     var password: String,
                                                     @Id
                                                     var id: Long = 0)