package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.entity.Order;
import com.example.ordermanagementsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getOrders(){

        return service.getAllOrders();

    }

    @GetMapping("/{id}")

    public Order getOrder(@PathVariable Integer id){

        return service.getOrderById(id);

    }

    @PostMapping

    public Order saveOrder(@RequestBody Order order){

        return service.saveOrder(order);

    }

    @PutMapping("/{id}")

    public Order updateOrder(@PathVariable Integer id,
                             @RequestBody Order order){

        return service.updateOrder(id,order);

    }

    @DeleteMapping("/{id}")

    public String deleteOrder(@PathVariable Integer id){

        return service.deleteOrder(id);

    }

}