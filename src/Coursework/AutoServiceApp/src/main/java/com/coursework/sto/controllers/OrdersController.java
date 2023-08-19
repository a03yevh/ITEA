package com.coursework.sto.controllers;

import com.coursework.sto.service.CustomerService;
import com.coursework.sto.models.Order;
import com.coursework.sto.models.OrderDetails;
import com.coursework.sto.service.OrderDetailsService;
import com.coursework.sto.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@Controller
public class OrdersController {
    @Autowired
    OrderService orderService;
    @Autowired
    CustomerService customerService;
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/orders")
    public String getAll(Model model){
        model.addAttribute("orders", orderService.findAll());
        return "orders/index";
    }

    @GetMapping("/orders/add")
    public String add(Model model){
        model.addAttribute("customers",customerService.findAll());
        return "orders/add";
    }

    @PostMapping("/orders/add")
    public String addPost(@RequestParam("idCustomer") Long idCustomer) {
        Order order = new Order();
        order.setCustomer(customerService.getById(idCustomer));
        orderService.save(order);


        Long maxId = orderService.findAll().stream()
                .mapToLong(v -> v.getId())
                .max().orElseThrow(NoSuchElementException::new);

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setOrder(orderService.getById(maxId));
        orderDetails.setStatus("Очікування");
        orderDetails.setInformation("");
        orderDetails.setOrderDate(LocalDateTime.now());

        orderDetailsService.save(orderDetails);

        return "redirect://localhost:8080/orders/";
    }


    @GetMapping("/orders/delete")
    public String delete(@RequestParam("id") Long id){
        orderService.deleteById(id);
        return "redirect://localhost:8080/orders/";
    }

    @GetMapping("/orders/edit")
    public String editGet(@RequestParam("id") Long id,Model model){
        model.addAttribute("order",orderService.getById(id));
        model.addAttribute("customers",customerService.findAll());
        return "/orders/edit";
    }

    @PostMapping("/orders/edit")
    public String editPost(@RequestParam("id") Long id,
                           @RequestParam("idCustomer") Long idCustomer) {
        Order order = orderService.getById(id);
        order.setCustomer(customerService.getById(idCustomer));

        orderService.save(order);

        return "redirect://localhost:8080/orders/";
    }

    @GetMapping("/orders/details")
    public String details(@RequestParam("id") Long id,Model model){
        model.addAttribute("order",orderService.getById(id));
        return "/orders/details";
    }

}
