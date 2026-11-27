package com.example.kktea_web.ayesha_2531729;

import java.time.LocalDate;

public class U5G1_LeafQualityCheck {

    private String lotNo;
    private String gardenSection;
    private double weightKg;
    private float fineLeafPct;
    private String calculatedGrade;
    private LocalDate checkDate;

    public U5G1_LeafQualityCheck(String lotNo, String gardenSection, double weightKg, float fineLeafPct, String calculatedGrade, LocalDate checkDate) {
        this.lotNo = lotNo;
        this.gardenSection = gardenSection;
        this.weightKg = weightKg;
        this.fineLeafPct = fineLeafPct;
        this.calculatedGrade = calculatedGrade;
        this.checkDate = checkDate;
    }

    public U5G1_LeafQualityCheck() {
    }
}
