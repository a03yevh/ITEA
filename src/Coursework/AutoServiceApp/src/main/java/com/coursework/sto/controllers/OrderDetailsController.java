package com.coursework.sto.controllers;

import com.coursework.sto.models.OrderDetails;
import com.coursework.sto.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class OrderDetailsController {
    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/orderdetails/edit")
    public String editGet(@RequestParam("id") Long id,Model model){
        model.addAttribute("orderdetails",orderDetailsService.getById(id));
        return "/orderdetails/edit";
    }

    @PostMapping("/orderdetails/edit")
    public String editPost(@RequestParam("id") Long id,
                           @RequestParam("information") String information,
                           @RequestParam("status") String status) {
        OrderDetails orderDetails = orderDetailsService.getById(id);
        orderDetails.setInformation(information);
        orderDetails.setStatus(status);
        orderDetails.setOrderDate(LocalDateTime.now());

        orderDetailsService.save(orderDetails);

        return "redirect://localhost:8080/orders/details?id=" + orderDetails.getOrder().getId();
    }

}
