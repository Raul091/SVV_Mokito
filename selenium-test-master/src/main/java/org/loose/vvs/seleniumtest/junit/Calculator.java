package org.loose.vvs.seleniumtest.junit;

import org.loose.vvs.seleniumtest.exceptions.*;

import java.util.List;

public class Calculator {
    public double calculateMeanFromThreeMaxGrades(List<Double> grades) {
        if (grades == null) {
            throw new NullListException();
        }

        if (grades.isEmpty()) {
            throw new EmptyListException();
        }

        if (grades.size() < 3) {
            throw new InvalidGradeCountException();
        }

        if (grades.size() > 5) {
            throw new TooManyNumbersException();
        }

        for (Double d : grades) {
            if (d < 0) {
                throw new NegativeNumberException();
            }
        }

        double max1 = getMax(grades);

        grades.remove(max1);
        double max2 = getMax(grades);

        grades.remove(max2);
        double max3 = getMax(grades);

        return (max1 + max2 + max3) / 3;
    }

    private double getMax(List<Double> grades) {
        double max = 0;
        for (Double grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }
}
