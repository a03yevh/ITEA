package com.coursework.sto.service;

import com.coursework.sto.models.Order;
import com.coursework.sto.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> findAll() {return orderRepository.findAll();}
    public Order getById(Long id) {return orderRepository.getById(id);}
    public void save(Order order) { orderRepository.save(order);}
    public void deleteById(Long id) { orderRepository.deleteById(id);}

}
