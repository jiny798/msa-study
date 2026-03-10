package cas.scale.module.catalogservice.service;

import cas.scale.module.catalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}