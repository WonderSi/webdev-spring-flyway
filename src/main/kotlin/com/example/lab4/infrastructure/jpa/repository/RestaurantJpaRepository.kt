package com.example.lab4.infrastructure.jpa.repository

import com.example.lab4.infrastructure.jpa.entity.RestaurantEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RestaurantJpaRepository : JpaRepository<RestaurantEntity, Long>