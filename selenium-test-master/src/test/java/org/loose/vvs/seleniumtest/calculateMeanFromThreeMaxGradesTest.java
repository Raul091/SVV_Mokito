package org.loose.vvs.seleniumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.loose.vvs.seleniumtest.exceptions.*;
import org.loose.vvs.seleniumtest.junit.Calculator;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class calculateMeanFromThreeMaxGradesTest {
    public Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void CalculateMeanWithNormalInput() {
        List<Double> grades = Arrays.asList(10.0, 8.0, 9.0);
        double calculateMean = calculator.calculateMeanFromThreeMaxGrades(grades);
        assertEquals(9.0, calculateMean, "This should be 9.0");
    }

    @Test
    void CalculateMeanWithNullInput() {
        //double calculateMean = calculator.calculateMeanFromThreeMaxGrades(grades);
        Assertions.assertThrows(NullListException.class, () -> {
            calculator.calculateMeanFromThreeMaxGrades(null);
        });
    }

    @Test
    void CalculateMeanWithNoInputs() {
        //double calculateMean = calculator.calculateMeanFromThreeMaxGrades(grades);
        Assertions.assertThrows(EmptyListException.class, () -> {
            calculator.calculateMeanFromThreeMaxGrades(Arrays.asList());
        });
    }

    @Test
    void CalculateMeanWithFewInputs() {
        //double calculateMean = calculator.calculateMeanFromThreeMaxGrades(grades);
        Assertions.assertThrows(InvalidGradeCountException.class, () -> {
            calculator.calculateMeanFromThreeMaxGrades(Arrays.asList(10.0, 9.0));
        });
    }

    @Test
    void CalculateMeanWithTooManyInputs() {
        //double calculateMean = calculator.calculateMeanFromThreeMaxGrades(grades);
        Assertions.assertThrows(TooManyNumbersException.class, () -> {
            calculator.calculateMeanFromThreeMaxGrades(Arrays.asList(10.0, 9.0, 8.0, 9.0, 10.0, 7.0));
        });
    }

    @Test
    void CalculateMeanWithNegativeInputs() {
        //double calculateMean = calculator.calculateMeanFromThreeMaxGrades(grades);
        Assertions.assertThrows(NegativeNumberException.class, () -> {
            calculator.calculateMeanFromThreeMaxGrades(Arrays.asList(10.0, -9.0, 8.0, 9.0));
        });
    }
}
