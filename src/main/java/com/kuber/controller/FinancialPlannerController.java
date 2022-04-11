package com.kuber.controller;

import com.kuber.Prediction;
import com.kuber.service.FinancialPlannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialPlannerController {

    private final FinancialPlannerService financialPlannerService;

    public FinancialPlannerController(
            FinancialPlannerService financialPlannerService) {
        this.financialPlannerService = financialPlannerService;
    }

    @GetMapping("/{predictionInput}/getValue")
    public String getValue(@PathVariable String predictionInput, @RequestParam Integer amount,
                           @RequestParam Float rateOfInterest, @RequestParam Integer duration) {
        try {
            Prediction prediction = Prediction.valueOf(predictionInput.toUpperCase());
            String response = "%s Value: %f/- Rs";
            Double finalAmount = financialPlannerService.getValue(prediction, amount, rateOfInterest, duration);
            return String.format(response, prediction.getValue(), finalAmount);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return "Invalid option selected";
        }
    }
}