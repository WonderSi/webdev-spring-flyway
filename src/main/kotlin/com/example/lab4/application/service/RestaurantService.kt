package com.example.lab4.application.service

import com.example.lab4.domain.model.Restaurant
import com.example.lab4.domain.port.RestaurantRepositoryPort
import org.springframework.stereotype.Service

@Service
class RestaurantService(
    private val restaurantRepositoryPort: RestaurantRepositoryPort
) {
    fun findAll(): List<Restaurant> = restaurantRepositoryPort.findAll()

    fun findById(id: Long): Restaurant =
        restaurantRepositoryPort.findById(id)
            ?: throw NoSuchElementException("Restaurant with id=$id not found")

    fun create(restaurant: Restaurant): Restaurant =
        restaurantRepositoryPort.save(restaurant)

    fun update(id: Long, restaurant: Restaurant): Restaurant {
        restaurantRepositoryPort.findById(id)
            ?: throw NoSuchElementException("Restaurant with id=$id not found")
        return restaurantRepositoryPort.update(restaurant.copy(id = id))
    }

    fun delete(id: Long) {
        val deleted = restaurantRepositoryPort.deleteById(id)
        if (!deleted) throw NoSuchElementException("Restaurant with id=$id not found")
    }
}