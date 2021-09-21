package com.dbs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.Order;

public interface OrderRepositry extends JpaRepository<Order, Integer>{

}
