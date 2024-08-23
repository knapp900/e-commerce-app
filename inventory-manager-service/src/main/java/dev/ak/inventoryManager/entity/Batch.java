package dev.ak.inventoryManager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Batch {

    private Long id;
    private String nameOfBatch;
    private LocalDateTime  dateOfReceipt;
    private double quantity;
    private BigDecimal costPrice;
}
