package com.puppeteer.reborn.framework.converter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdName {
    private String eId;
    private String name;

    /**
     * Creates.
     *
     * @param eId  eId
     * @param name name
     * @return {@link IdName}
     */
    public static IdName create(String eId, String name) {
        return new IdName(eId, name);
    }
}
