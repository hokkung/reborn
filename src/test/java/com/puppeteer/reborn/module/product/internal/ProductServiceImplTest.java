package com.puppeteer.reborn.module.product.internal;

import com.puppeteer.reborn.module.product.Product;
import com.puppeteer.reborn.module.product.ProductMapper;
import com.puppeteer.reborn.module.product.ProductRepository;
import com.puppeteer.reborn.module.product.model.ProductDTO;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceImplTest {
    private ProductServiceImpl underTest;
    private ProductRepository mockProductRepository;

    @BeforeEach
    void setUp() {
        mockProductRepository = mock(ProductRepository.class);

        underTest = new ProductServiceImpl();
        underTest.setProductRepository(mockProductRepository);
    }

    @Test
    void testGetAll() {
        Product p1 = createProduct("1");
        Product p2 = createProduct("2");
        List<Product> products = List.of(p1, p2);

        ProductDTO dto1 = ProductMapper.INSTANCE.toProductDTO(p1);
        ProductDTO dto2 = ProductMapper.INSTANCE.toProductDTO(p2);

        when(mockProductRepository.findAll()).thenReturn(products);

        List<ProductDTO> result = underTest.getAll();

        MatcherAssert.assertThat(result.size(), CoreMatchers.equalTo(2));
        MatcherAssert.assertThat(result.get(0), CoreMatchers.equalTo(dto1));
        MatcherAssert.assertThat(result.get(1), CoreMatchers.equalTo(dto2));
    }

    private Product createProduct(String name) {
        ProductImpl product = ProductImpl.create();
        product.setName(name);

        return product;
    }
}
