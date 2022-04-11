package com.kuber.service.impl;

import com.kuber.Formulas;
import com.kuber.Prediction;
import com.kuber.service.FinancialPlannerService;
import org.springframework.stereotype.Service;

@Service
public class FinancialPlannerServiceImpl implements FinancialPlannerService {

    @Override
    public double getValue(Prediction prediction, Integer amount, Float rateOfInterest, Integer duration) {
        if (prediction.equals(Prediction.PRESENT)) {
            return Formulas.PRESENT_VALUE.apply(amount, rateOfInterest/100, duration);
        } else {
            return Formulas.FUTURE_VALUE.apply(amount, rateOfInterest/100, duration);
        }
    }
}