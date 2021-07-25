package com.puppeteer.reborn.module.product.model;

import com.puppeteer.reborn.module.product.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ProductDTO {
    private String eId;
    private String name;
    private Double price;
    private Date createdTime;
}
