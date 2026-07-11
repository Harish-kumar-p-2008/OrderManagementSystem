package com.example.ordermanagementsystem.service;

import com.example.ordermanagementsystem.entity.Order;
import com.example.ordermanagementsystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> getAllOrders() {

        return repository.findAll();

    }

    public Order getOrderById(Integer id) {

        return repository.findById(id).orElse(null);

    }

    public Order saveOrder(Order order) {

        return repository.save(order);

    }

    public Order updateOrder(Integer id,Order order){

        Order oldOrder=repository.findById(id).orElse(null);

        if(oldOrder!=null){

            oldOrder.setProductName(order.getProductName());
            oldOrder.setQuantity(order.getQuantity());
            oldOrder.setPrice(order.getPrice());

            return repository.save(oldOrder);

        }

        return null;

    }

    public String deleteOrder(Integer id){

        repository.deleteById(id);

        return "Order Deleted Successfully";

    }

}