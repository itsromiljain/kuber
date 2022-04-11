package com.kuber.service;

import com.kuber.Prediction;
import org.springframework.stereotype.Component;

@Component
public interface FinancialPlannerService {

    double getValue(Prediction prediction, Integer amount, Float rateOfInterest, Integer duration);

}
