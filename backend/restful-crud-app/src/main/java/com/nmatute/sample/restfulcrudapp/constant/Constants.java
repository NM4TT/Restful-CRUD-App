package com.nmatute.sample.restfulcrudapp.constant;

public enum Constants {
    
    SOMECONSTANT1("bla1"),
    SOMECONSTANT2("bla2");

    private final String value;

    Constants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
