package com.puppeteer.reborn.module.product.internal;


import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class ProductImplTest {
    private static final Date MOCK_DATE = new Date();
    private ProductImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new ProductImpl();
    }

    @Test
    public void testCreate() {
        Assertions.assertNull(underTest.getName());
        Assertions.assertNull(underTest.getExternalId());
        Assertions.assertNotNull(underTest.getCreatedTime());
        Assertions.assertNull(underTest.getPrice());
        Assertions.assertNull(underTest.getEId());
        Assertions.assertNull(underTest.getId());

        underTest.setId("id");
        underTest.setName("name");
        underTest.setPrice(20.5);
        underTest.setEId("eid");
        underTest.setExternalId("external");
        underTest.setCreatedTime(MOCK_DATE);

        MatcherAssert.assertThat(underTest.getId(), CoreMatchers.equalTo("id"));
        MatcherAssert.assertThat(underTest.getName(), CoreMatchers.equalTo("name"));
        MatcherAssert.assertThat(underTest.getPrice(), CoreMatchers.equalTo(20.5));
        MatcherAssert.assertThat(underTest.getEId(), CoreMatchers.equalTo("eid"));
        MatcherAssert.assertThat(underTest.getExternalId(), CoreMatchers.equalTo("external"));
        MatcherAssert.assertThat(underTest.getCreatedTime(), CoreMatchers.equalTo(MOCK_DATE));
    }
}
