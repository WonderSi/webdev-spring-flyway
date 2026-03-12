package com.example.lab4.domain.port

import com.example.lab4.domain.model.Order
import com.example.lab4.domain.model.OrderStatus

interface OrderRepositoryPort {
    fun findAll(userId: Long?, status: OrderStatus?): List<Order>
    fun findById(id: Long): Order?
    fun save(order: Order): Order
    fun update(order: Order): Order
}