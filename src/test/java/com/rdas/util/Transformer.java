package com.rdas.util;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

/**
 * Created by rdas on 02/10/2016.
 */
@Component
public class Transformer {

    @PostConstruct
    public void init() {
        System.out.println("\n --  INIT \n");
    }
}
