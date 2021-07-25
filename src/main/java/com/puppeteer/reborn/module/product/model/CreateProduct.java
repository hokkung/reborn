package com.puppeteer.reborn.module.product.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CreateProduct {
    @NotBlank
    private String name;
    @NotBlank
    private String eId;
    @NotBlank
    private String externalId;
    @NotNull
    private Double price;
}
