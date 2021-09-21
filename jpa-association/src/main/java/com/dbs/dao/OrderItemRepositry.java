package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.OrderItem;

public interface OrderItemRepositry extends JpaRepository<OrderItem, Integer> {

}
