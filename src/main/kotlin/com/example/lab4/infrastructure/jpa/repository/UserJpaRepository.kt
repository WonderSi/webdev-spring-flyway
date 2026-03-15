package com.example.lab4.infrastructure.jpa.repository

import com.example.lab4.infrastructure.jpa.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserJpaRepository : JpaRepository<UserEntity, Long> {

    fun findByEmail(email: String): UserEntity?

}