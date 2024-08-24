package dev.ak.inventoryManager.service;

import dev.ak.inventoryManager.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


/**
 * Интерфейс для управления продуктами в системе.
 * Предоставляет методы для получения, обновления и изменения статусов продуктов.
 */
public interface ProductManagementService {

    /**
     * Возвращает страницу продуктов с поддержкой пагинации.
     *
     * @param pageable Объект Pageable, определяющий параметры пагинации (номер страницы, размер страницы и сортировка).
     * @return Page объектов Product, соответствующих параметрам пагинации.
     */
    Page<Product> getAllProducts(Pageable pageable);

    /**
     * Возвращает продукт по его уникальному идентификатору.
     *
     * @param id Уникальный идентификатор продукта.
     * @return Optional, содержащий найденный продукт, если он существует; пустой Optional, если продукт не найден.
     */
    Optional<Product> getProduct(long id);

    /**
     * Обновляет информацию о продукте по его уникальному идентификатору.
     *
     * @param id      Уникальный идентификатор продукта, который нужно обновить.
     * @param product Объект Product, содержащий обновленную информацию.
     * @return Обновленный объект Product.
     */
    Product updateProduct(long id, Product product);

    /**
     * Устанавливает статус активности для продукта.
     *
     * @param id       Уникальный идентификатор продукта.
     * @param isActive Логическое значение, определяющее, должен ли продукт быть активным.
     */
    void setActiveProduct(long id, boolean isActive);

    /**
     * Устанавливает статус публикации для продукта.
     *
     * @param id        Уникальный идентификатор продукта.
     * @param isPublish Логическое значение, определяющее, должен ли продукт быть опубликован.
     */
    void setPublishProduct(long id, boolean isPublish);

}
