package dev.ak.inventoryManager.entity;

import java.util.List;

public class Order {
    private Long id;
    private OrderItem orderItem;
    private List<OrderItem> orderedProducts;
    private OrderProcessingStatus orderProcessingStatus;
    private String mangerComment;
}
