package com.scottross123.bakeryapi.controllers;

import com.scottross123.bakeryapi.model.Customer;
import com.scottross123.bakeryapi.model.Order;
import com.scottross123.bakeryapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    
    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }

    @PutMapping("/{id}")
    public void updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
        customerService.updateCustomer(id, updatedCustomer);
    }

    @GetMapping("/{id}/orders")
    public Set<Order> getOrders(@PathVariable Long id){
        return customerService.getOrders(id);
    }
}
