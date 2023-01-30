package org.loose.vvs.seleniumtest;

//import org.junit.Assertions.*;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.loose.vvs.seleniumtest.exceptions.NullListException;
import org.loose.vvs.seleniumtest.services.GradeCalculator;
import org.loose.vvs.seleniumtest.services.GradesService;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class GradeServiceTest {
    private GradeCalculator gradeCalculator = Mockito.mock(GradeCalculator.class);
    private GradesService gradesService = new GradesService(gradeCalculator);

    @Test//(expected = NullListException.class)
    public void testCalculateMeanWithNullList() {
        gradesService.calculateMean(null);
    }

}


