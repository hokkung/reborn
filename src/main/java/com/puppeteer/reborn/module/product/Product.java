package com.puppeteer.reborn.module.product;

import com.puppeteer.reborn.framework.entity.Entity;
import com.puppeteer.reborn.framework.entity.ExternalId;

import java.util.Date;

public interface Product extends Entity<String>, ExternalId {
    /**
     * Gets name.
     *
     * @return name
     */
    String getName();

    /**
     * Sets name.
     *
     * @param name name
     */
    void setName(String name);

    /**
     * Gets eid.
     *
     * @return eid
     */
    String getEId();

    /**
     * Sets eid.
     *
     * @param eId eId
     */
    void setEId(String eId);

    /**
     * Gets price.
     *
     * @return price
     */
    Double getPrice();

    /**
     * Sets price.
     *
     * @param price price
     */
    void setPrice(Double price);

    /**
     * Gets created time.
     *
     * @return created time
     */
    Date getCreatedTime();

    /**
     * Sets created time
     *
     * @param createdTime created time
     */
    void setCreatedTime(Date createdTime);
}
