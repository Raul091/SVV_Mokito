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
public class StudentServiceTest2 {
    @Test
    void testgetFirstNameOfNthStudentInUppercaseNoStudentsException(){
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
        assertThrows(NoSuchStudentException.class, () -> studentService.getFirstNameOfNthStudentInUppercase(0));
    }
    @Test
    void testNameOfNStudent(){

    }
    private static class MockProductProvider implements StudentProvider{
        private static List<Student> students = Arrays.asList(
                new Student("Ana Maria",23),
                new Student("Jurj Alin",21)
        );
        @Override
        public List<Student> getStudentNames() {
            return students;
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
    }
}
