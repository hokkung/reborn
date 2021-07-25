package com.puppeteer.reborn.framework.entity.internal;

import com.puppeteer.reborn.framework.entity.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public abstract class AbstractEntity<T> {
    private static final long serialVersionUID = 1L;
    @Id
    private T id;
}
