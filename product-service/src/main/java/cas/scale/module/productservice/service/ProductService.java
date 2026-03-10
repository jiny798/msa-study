package cas.scale.module.productservice.service;

import cas.scale.module.productservice.jpa.ProductEntity;

public interface ProductService {
    Iterable<ProductEntity> getAllProducts();
}