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
public class StudentServiceTest {

    private static List<Student> students= new ArrayList<>(Arrays.asList(
            new Student("Alin Jurj",22),
            new Student("Flavia Mioc",21)
    ));

    @Test
    void getFirstNameOfNthStudentInUppercaseInlineNoStudents(){
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
        assertThrows(NoSuchStudentException.class, () -> studentService.getFirstNameOfNthStudentInUppercase(1));
    }
    @Test
    void getFirstNameOfNthStudentInUppercaseInlineNegativeValueOfNStudents(){
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
        assertThrows(IndexOutOfBoundsException.class, () -> studentService.getFirstNameOfNthStudentInUppercase(-1));
    }
    @Test
    void getFirstNameOfNthStudentInUppercaseInlineNullStudents(){
        StudentService studentService = new StudentService();
        studentService.setStudentProvider(new StudentProvider() {
            @Override
            public List<Student> getStudentNames() {
                return null;
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
        assertThrows(NullPointerException.class, () -> studentService.getFirstNameOfNthStudentInUppercase(1));
    }
    @Test
    void testgetFirstNameOfNthStudentInUppercaseSeparateManyStudents() {

        StudentService studentService = new StudentService();
        studentService.setStudentProvider(new MockStudentProvider());
        assertEquals("ALIN", studentService.getFirstNameOfNthStudentInUppercase(0));
    }

    class MockStudentProvider implements StudentProvider{

        @Override
        public List<String> getStudentNames() {
            List<String> students = new ArrayList<>();
            students.add("Alin Jurj");
            students.add("Flavia Mioc");
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
    @Mock
    private StudentProvider studentProvider;
    @Test
    void getFirstNameOfNthStudentInUppercase_Mockito_NameFormatException(@Mock StudentProvider studentProvider)
    {
        List<String> names = new ArrayList<>(){{
            add("Alin");
            add("Flavia");
        }};
        StudentService studentService = new StudentService();


        when(studentProvider.getStudentNames()).thenReturn(names);
        studentService.setStudentProvider(studentProvider);
        // assertEquals("ALIN", studentService.getFirstNameOfNthStudentInUppercase(0));
        assertThrows(NameFormatException.class,() ->studentService.getFirstNameOfNthStudentInUppercase(0));
    }


}
