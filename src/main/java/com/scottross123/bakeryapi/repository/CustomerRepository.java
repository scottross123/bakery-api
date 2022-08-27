package com.scottross123.bakeryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scottross123.bakeryapi.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {}
