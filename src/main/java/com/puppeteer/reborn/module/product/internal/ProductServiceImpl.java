package com.puppeteer.reborn.module.product.internal;

import com.puppeteer.reborn.module.product.*;
import com.puppeteer.reborn.module.product.ProductMapper;
import com.puppeteer.reborn.module.product.model.CreateProduct;
import com.puppeteer.reborn.module.product.model.ProductDTO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAll() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductMapper.INSTANCE::toProductDTO).collect(Collectors.toList());
    }

    @Override
    public ProductDTO create(CreateProduct req) {
        Product product = ProductImpl.create(req);
        return ProductMapper.INSTANCE.toProductDTO(productRepository.save(product));
    }

    @Override
    public ProductDTO random() {
        List<Product> products = productRepository.findAll();
        Collections.shuffle(products);
        return ProductMapper.INSTANCE.toProductDTO(products.get(0));
    }

    @Override
    public List<ProductDTO> get(String eId) {
        Product product = productRepository.findByEId(eId).orElse(null);
        Product product2 = productRepository.findByExternalId(eId).orElse(null);
        List<Product> products2 = productRepository.findByName(eId);
        return products2.stream().map(ProductMapper.INSTANCE::toProductDTO).collect(Collectors.toList());
    }
}
