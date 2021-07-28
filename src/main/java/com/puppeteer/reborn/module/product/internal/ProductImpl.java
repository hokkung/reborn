package com.puppeteer.reborn.module.product.internal;

import com.puppeteer.reborn.framework.entity.internal.AbstractEntity;
import com.puppeteer.reborn.module.product.Product;
import com.puppeteer.reborn.module.product.model.CreateProduct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "product")
@Setter
@Getter
public class ProductImpl extends AbstractEntity<String> implements Product {
    private String name;
    @Field("eId")
    private String eId;
    @Indexed(unique = true)
    private String externalId;
    private Double price;
    private Date createdTime;

    ProductImpl() {
        createdTime = new Date();
    }

    /**
     * Creates.
     *
     * @return {@link ProductImpl}
     */
    public static ProductImpl create() {
       return new ProductImpl();
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
        product.setExternalId(req.getExternalId());

        return product;
    }
}
