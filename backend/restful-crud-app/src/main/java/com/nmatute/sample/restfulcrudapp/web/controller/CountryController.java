package com.nmatute.sample.restfulcrudapp.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmatute.sample.restfulcrudapp.domain.dto.CountryDTO;
import com.nmatute.sample.restfulcrudapp.domain.service.CountryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CountryController {
 
    private final CountryService countryService;

    @GetMapping("/get")
    public ResponseEntity<CountryDTO> getCountry(
        @RequestParam(value = "country", required = true)
        String name
    ){
        CountryDTO country = null;
        HttpStatus status = null;

        try {
            country = countryService.findCountry(name);
            status = HttpStatus.FOUND;
        } catch (Exception e) {
            status = HttpStatus.NOT_FOUND;
        }

        return new ResponseEntity<>(country,status); 
    }

}
