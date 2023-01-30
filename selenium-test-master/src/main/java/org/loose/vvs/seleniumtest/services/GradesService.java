package org.loose.vvs.seleniumtest.services;

import org.loose.vvs.seleniumtest.exceptions.EmptyListException;
import org.loose.vvs.seleniumtest.exceptions.InvalidGradeCountException;
import org.loose.vvs.seleniumtest.exceptions.NullListException;

import java.util.List;

public class GradesService {

    private final GradeCalculator gradeCalculator;

    public GradesService(GradeCalculator gradeCalculator) {
        this.gradeCalculator = gradeCalculator;
    }

    public double calculateMean(List<Double> grades) {
        if (grades == null) {
            throw new NullListException();
        }

        if (grades.isEmpty()) {
            throw new EmptyListException();
        }

        if (grades.size() < 3) {
            throw new InvalidGradeCountException();
        }

        return gradeCalculator.calculateMeanFromThreeMinGrades(grades);
    }
}
