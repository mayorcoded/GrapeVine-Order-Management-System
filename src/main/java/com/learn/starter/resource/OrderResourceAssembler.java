package com.learn.starter.resource;

import com.learn.starter.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Component;

@Component
public class OrderResourceAssembler extends ResourceAssembler<Order, OrderResource>{

    private EntityLinks entityLinks;

    private static final String UPDATE_REL = "updates";
    private static final String DELETE_REL = "delete";

    @Override
    public OrderResource toResource(Order order) {
        OrderResource resource = new OrderResource(order);

        final Link selfLink = entityLinks.linkToSingleResource(order);

        resource.add(selfLink.withSelfRel());
        resource.add(selfLink.withRel(UPDATE_REL));
        resource.add(selfLink.withRel(DELETE_REL));

        return resource;
    }
}
