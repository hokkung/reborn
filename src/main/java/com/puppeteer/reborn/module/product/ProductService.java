package com.puppeteer.reborn.module.product;

import com.puppeteer.reborn.framework.converter.IdName;
import com.puppeteer.reborn.module.product.model.CreateProduct;
import com.puppeteer.reborn.module.product.model.ProductDTO;

import java.util.List;

public interface ProductService {
    /**
     * Gets all
     *
     * @return products
     */
    List<ProductDTO> getAll();

    /**
     * Creates product.
     *
     * @return product
     */
    ProductDTO create(CreateProduct req);

    /**
     * Random products.
     *
     * @return product
     */
    ProductDTO random();

    /**
     * Gets by eId
     *
     * @return products
     */
    List<ProductDTO> get(String eId);
}
