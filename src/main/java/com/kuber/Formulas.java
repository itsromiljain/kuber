package com.kuber;

public class Formulas {
    public static final TriFunction<Integer, Float, Integer, Double> FUTURE_VALUE =
            (amount, rateOfInterest, duration) -> amount * Math.pow(1 + rateOfInterest, duration
            );
    public static final TriFunction<Integer, Float, Integer, Double> PRESENT_VALUE =
            (amount, rateOfInterest, duration) -> amount * (1/Math.pow(1 + rateOfInterest, duration
            ));

    private Formulas() {

    }
}
