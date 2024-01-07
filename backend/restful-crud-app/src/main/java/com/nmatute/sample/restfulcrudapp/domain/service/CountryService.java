package com.nmatute.sample.restfulcrudapp.domain.service;

import org.springframework.stereotype.Service;

import com.nmatute.sample.restfulcrudapp.domain.dto.CountryDTO;
import com.nmatute.sample.restfulcrudapp.mapping.CountryMapper;
import com.nmatute.sample.restfulcrudapp.persistence.repository.CountryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryService {
    
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryDTO findCountry(String name) {
        return countryMapper.toDTO(countryRepository.getCountries().get(name));
    }

}
