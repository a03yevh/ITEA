package com.coursework.sto.service;

import com.coursework.sto.models.Customer;
import com.coursework.sto.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll() {return customerRepository.findAll();}
    public Customer getById(Long id) {return customerRepository.getById(id);}
    public void save(Customer customer) {
        customerRepository.save(customer);}
    public void deleteById(Long id) {
        customerRepository.deleteById(id);}

}
