package com.coursework.sto.controllers;

import com.coursework.sto.models.Customer;
import com.coursework.sto.service.CustomerService;
import com.coursework.sto.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomersController {
    @Autowired
    CustomerService customerService;
    @Autowired
    OrderService orderService;

    @GetMapping("/customers")
    public String getAll(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "customers/index";
    }

    @GetMapping("/customers/add")
    public String addGet(Model model){
        model.addAttribute("customers", customerService.findAll());
        return "customers/add";
    }

    @PostMapping("/customers/add")
    public String addPost(@RequestParam("fullName") String fullName,
                          @RequestParam("phone") String phone) {
        Customer customer = new Customer();
        customer.setFullName(fullName);
        customer.setPhone(phone);

        customerService.save(customer);

        return "redirect://localhost:8080/customers/";
    }


    @GetMapping("/customers/delete")
    public String delete(@RequestParam("id") Long id){

        long[] ordersIds = customerService.getById(id).getOrders().stream().mapToLong(x->x.getId()).toArray();

        customerService.deleteById(id);

        for(Long ids : ordersIds){
            orderService.deleteById(ids);
        }

        return "redirect://localhost:8080/customers/";
    }

    @GetMapping("/customers/edit")
    public String editGet(@RequestParam("id") Long id,Model model){
        model.addAttribute("customer",customerService.getById(id));
        return "/customers/edit";
    }

    @PostMapping("/customers/edit")
    public String editPost(@RequestParam("id") Long id,
                           @RequestParam("fullName") String fullName,
                           @RequestParam("phone") String phone) {
        Customer customer = customerService.getById(id);
        customer.setFullName(fullName);
        customer.setPhone(phone);

        customerService.save(customer);

        return "redirect://localhost:8080/customers/";
    }

    @GetMapping("/customers/details")
    public String details(@RequestParam("id") Long id,Model model){
        model.addAttribute("customer",customerService.getById(id));
        return "/customers/details";
    }

}
