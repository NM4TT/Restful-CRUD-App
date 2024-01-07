package com.nmatute.sample.restfulcrudapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDTO {
    private String name;
    private String capital;
    private Long population;
    private CurrencyDTO currency;

    public static enum CurrencyDTO {

        GBP,
        EUR,
        PLN;
    
        public String value() {
            return name();
        }
    
        public static CurrencyDTO fromValue(String v) {
            return valueOf(v);
        }
    
    }

}