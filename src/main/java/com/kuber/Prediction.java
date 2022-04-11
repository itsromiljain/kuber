package com.kuber;

public enum Prediction {
    PRESENT("Present"),
    FUTURE("Future");

    private final String value;

    Prediction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
