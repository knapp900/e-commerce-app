package dev.ak.inventoryManager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {

    private Long id;
    private String name;
    private String description;
    private List<String> picturesURIs;
    private List<Batch> batches;
    private BigDecimal averagePrice;
    private LocalDateTime createdAt;
    private boolean isAutoPricing;
    //TODO написать валидацию отпускной цены
    private BigDecimal sellingPrice; // цена не может быть меньше чем самая низкая цена партии + 15%

}
