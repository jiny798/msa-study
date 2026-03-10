package cas.scale.module.orderservice.service;


import cas.scale.module.orderservice.dto.OrderDto;
import cas.scale.module.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}