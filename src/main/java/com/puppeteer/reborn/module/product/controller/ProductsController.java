package com.puppeteer.reborn.module.product.controller;

import com.puppeteer.reborn.framework.converter.IdName;
import com.puppeteer.reborn.module.product.ProductService;
import com.puppeteer.reborn.module.product.model.CreateProduct;
import com.puppeteer.reborn.module.product.model.ProductDTO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Setter
@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductService productService;

    /**
     * Gets all products.
     *
     * @return products
     */
    @GetMapping("")
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    /**
     * Gets random products.
     *
     * @return product
     */
    @GetMapping("/random")
    public ProductDTO random() {
        return productService.random();
    }

    /**
     * Creates product.
     *
     * @return product
     */
    @PostMapping
    public ProductDTO create(@Valid @RequestBody CreateProduct req) {
        return productService.create(req);
    }

    /**
     * Gets by id-name.
     *
     * @return product
     */
    @GetMapping("/{eId}")
    public List<ProductDTO> get(@PathVariable String eId) {
        return productService.get(eId);
    }
}
