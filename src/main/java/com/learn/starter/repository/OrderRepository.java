package com.learn.starter.repository;

import com.learn.starter.domain.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderRepository extends InMemoryRepository<Order> {
    @Override
    protected void updateIfExists(Order original, Order updated) {
        original.setDescription(updated.getDescription());
        original.setCostInCents(updated.getCostInCents());
        original.setComplete(updated.isComplete());
    }
}
