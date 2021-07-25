package com.puppeteer.reborn.module.product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    /**
     * Finds by eid
     *
     * @param eId eId
     * @return product
     */
    @Query("{ 'eId' : ?0 }")
    Optional<Product> findByEId(String eId);

    /**
     * Finds by external id
     *
     * @param externalId externalId
     * @return product
     */
    Optional<Product> findByExternalId(String externalId);

    /**
     * Finds by name
     *
     * @param name name
     * @return products
     */
    List<Product> findByName(String name);
}
