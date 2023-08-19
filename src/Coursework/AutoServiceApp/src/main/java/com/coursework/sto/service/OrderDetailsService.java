package com.coursework.sto.service;

import com.coursework.sto.models.OrderDetails;
import com.coursework.sto.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService {
    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    public List<OrderDetails> findAll() {return orderDetailsRepository.findAll();}
    public OrderDetails getById(Long id) {return orderDetailsRepository.getById(id);}
    public void save(OrderDetails order) { orderDetailsRepository.save(order);}
    public void deleteById(Long id) { orderDetailsRepository.deleteById(id);}
    
}
