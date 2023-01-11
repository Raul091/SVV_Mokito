package org.loose.vvs.mocking;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateTheAgeOfAllStudents {
    private static List<String> studentNames =  new ArrayList<String>();
    private static final List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Alin Jurj",22),
            new Student("Flavia Mioc",21),
            new Student("Mihai Georgescu",21)
    ));
    @Test
    void UpdateTheAgeOfAllStudents_InlineNoStudents(){
            StudentService studentService = new StudentService();
            studentService.setStudentProvider(new StudentProvider() {
                @Override
                public List<Student> getStudentNames() {
                    return new ArrayList<>();
                }

                @Override
                public List<Student> getAllStudents() {
                    return new ArrayList<>();
                }

                @Override
                public Student getStudentByName(String name) {
                    return null;
                }

                @Override
                public void replaceStudent(Student student) {

                }
            });
            assertThrows(NoSuchStudentException.class, () -> studentService.updateTheAgeOfAllTheStudentsWithName("Ana",22));
    }
    @Test
    void UpdateTheAgeOfAllStudents_InlineNoStudentsNullPointer(){
        StudentService studentService = new StudentService();
        studentService.setStudentProvider(new StudentProvider() {
            @Override
            public List<Student> getStudentNames() {
                return new ArrayList<>();
            }

            @Override
            public List<Student> getAllStudents() {
                return new ArrayList<>();
            }

            @Override
            public Student getStudentByName(String name) {
                return null;
            }

            @Override
            public void replaceStudent(Student student) {

            }
        });
        assertThrows(NullPointerException.class, () -> studentService.updateTheAgeOfAllTheStudentsWithName(null,22));
    }
    @Test
    void updateTheAgeOfl
}
