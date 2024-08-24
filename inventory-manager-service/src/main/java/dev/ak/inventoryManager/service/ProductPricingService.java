package dev.ak.inventoryManager.service;

import dev.ak.inventoryManager.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Интерфейс для управления ценами на продукты в системе.
 * Предоставляет методы для создания продуктов с автоматическим назначением цены, массового добавления продуктов
 * и установки цены на существующий продукт.
 */
public interface ProductPricingService {

    /**
     * Создает продукт с автоматическим назначением цены.
     *
     * @param product             Продукт, который нужно создать.
     * @param markupInPercentage  Процент наценки, который будет добавлен к себестоимости продукта.
     * @param isPublished         Флаг, определяющий, должен ли продукт быть опубликован сразу после создания.
     * @return Optional, содержащий созданный продукт, если операция была успешной.
     */
    Optional<Product> createProductWithAutoPricing(Product product, double markupInPercentage, boolean isPublished);

    /**
     * Создает список продуктов с автоматическим назначением цены.
     *
     * @param products            Список продуктов, которые нужно создать.
     * @param markupInPercentage  Процент наценки, который будет добавлен к себестоимости каждого продукта.
     * @param isPublished         Флаг, определяющий, должны ли продукты быть опубликованы сразу после создания.
     * @return Список созданных продуктов.
     */
    List<Product> createProductsWithAutoPricing(List<Product> products, double markupInPercentage, boolean isPublished);

    /**
     * Устанавливает цену на существующий продукт.
     *
     * @param product Продукт, для которого устанавливается цена.
     * @param price   Новая цена продукта.
     * @return Обновленный продукт с установленной ценой.
     */
    Product setProductPrice(Product product, BigDecimal price);
}
