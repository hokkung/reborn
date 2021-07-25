package com.puppeteer.reborn.module.product.internal;

import com.puppeteer.reborn.framework.entity.internal.AbstractEntity;
import com.puppeteer.reborn.module.product.Product;
import com.puppeteer.reborn.module.product.model.CreateProduct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
@Setter
@Getter
public class ProductImpl extends AbstractEntity<String> implements Product {
    private String name;
    private String eId;
    private Double price;
    private Date createdTime;

    ProductImpl() {
        createdTime = new Date();
    }

    /**
     * Creates.
     *
     * @param req req
     * @return {@link ProductImpl}
     */
    public static ProductImpl create(CreateProduct req) {
        ProductImpl product = new ProductImpl();
        product.setName(req.getName());
        product.setPrice(req.getPrice());
        product.setEId(req.getEId());

        return product;
    }
}
