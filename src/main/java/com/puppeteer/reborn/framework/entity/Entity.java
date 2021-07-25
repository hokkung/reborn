package com.puppeteer.reborn.framework.entity;

public interface Entity<T> {
    /**
     * Gets id.
     *
     * @return id
     */
    T getId();

    /**
     * Sets id.
     *
     * @param id id
     */
    void setId(T id);
}
