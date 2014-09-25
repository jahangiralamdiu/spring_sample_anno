package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

import java.util.List;

/**
 * Created by lenovo on 25/09/2014.
 */
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository)
    {

        System.out.println("I am the result of constructor injection");
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
