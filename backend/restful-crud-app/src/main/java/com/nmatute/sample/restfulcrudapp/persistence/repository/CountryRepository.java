package com.nmatute.sample.restfulcrudapp.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nmatute.sample.restfulcrudapp.persistence.entity.Country;
import com.nmatute.sample.restfulcrudapp.persistence.entity.Country.Currency;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
@Getter
public class CountryRepository {

    private final Map<String, Country> countries = new HashMap<>();
    
    @PostConstruct
    public void initData() {

        Country country1 = new Country();
        country1.setCapital("Madrid");
        country1.setCurrency(Currency.EUR);
        country1.setName("España");
        country1.setPopulation(8000000L);

        countries.put("España", country1);
    }

}