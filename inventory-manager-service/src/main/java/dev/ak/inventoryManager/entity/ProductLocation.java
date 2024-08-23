package dev.ak.inventoryManager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductLocation {
    private String warehouseNumber;
    private String section;
    private String shelf;
    private String bin;
}
