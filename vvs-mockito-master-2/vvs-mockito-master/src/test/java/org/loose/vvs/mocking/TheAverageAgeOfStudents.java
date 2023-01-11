package org.loose.vvs.mocking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class TheAverageAgeOfStudents {
    private static List<Student> students= new ArrayList<>(Arrays.asList(
            new Student("Alin Jurj",22),
            new Student("Flavia Mioc",21)
    ));
    @Test
    void testTheAverageAgeOfStudents(){
        StudentService studentService = new StudentService();
        studentService.setStudentProvider(new StudentProvider() {
            @Override
            public List<Student> getStudentNames() {
                return null;
            }

            @Override
            public List<Student> getAllStudents() {
                return null;
            }

            @Override
            public Student getStudentByName(String name) {
                return null;
            }

            @Override
            public void replaceStudent(Student student) {

            }
        });
        List<String>  t = null;

        assertThrows(NullPointerException.class, () -> studentService.getTheAverageAgeOfTheStudentThatHaveTheName(t));

    }

}
