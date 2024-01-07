package com.nmatute.sample.restfulcrudapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {
    
    private String name;
    
    private String capital;

    private Long population;

    private Currency currency;

    public static enum Currency {

        GBP,
        EUR,
        PLN;
    
        public String value() {
            return name();
        }
    
        public static Currency fromValue(String v) {
            return valueOf(v);
        }
    
    }

}