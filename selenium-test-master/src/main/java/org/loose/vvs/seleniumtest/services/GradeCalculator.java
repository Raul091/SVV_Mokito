package org.loose.vvs.seleniumtest.services;

import java.util.List;

public interface GradeCalculator {

    /**
     * @param grades the list of grades
     * @return the mean of the three smallest numbers from the list
     */
    double calculateMeanFromThreeMinGrades(List<Double> grades);
}
