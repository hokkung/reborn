package com.puppeteer.reborn.module.product;

import com.puppeteer.reborn.module.product.model.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    /**
     * Maps.
     *
     * @param product {@link Product}
     * @return {@link ProductDTO}
     */
    ProductDTO toProductDTO(Product product);
}
