package com.scottross123.bakeryapi.repository;

import com.scottross123.bakeryapi.model.Customer;
import com.scottross123.bakeryapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> { }
