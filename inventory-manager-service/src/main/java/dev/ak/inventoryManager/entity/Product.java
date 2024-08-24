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
    private TypeOfSale typeOfSale;
    private double minimumQuantityForSale;
    private Long categoryId;
    private List<String> picturesURIs;
    private List<Batch> batches;
    private LocalDateTime createdAt;
    private boolean isPublished;
    private boolean isAutoPricing;
    private boolean isActive;
    private ProductLocation location;
    /*
    TODO
    Написать валидацию отпускной цены Тип BigDecimal для sellingPrice:
    Убедитесь, что валидация также учитывает правильность формата
    (например, точность до двух знаков после запятой).
     */
    private BigDecimal sellingPrice; // цена не может быть меньше чем самая низкая цена партии + 15%

}
