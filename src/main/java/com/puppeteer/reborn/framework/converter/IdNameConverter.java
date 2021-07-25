package com.puppeteer.reborn.framework.converter;

import org.springframework.core.convert.converter.Converter;

public class IdNameConverter implements Converter<String, IdName> {
    @Override
    public IdName convert(String s) {
        String[] words = s.split("-");
        return IdName.create(words[0], words[1]);
    }
}
