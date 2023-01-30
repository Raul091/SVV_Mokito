# JUnit Test (Test 1)

Test the `calculateMeanFromThreeMaxGrades(List<Double> grades)` method from the [Calculator](src/main/java/org/loose/vvs/seleniumtest/junit/Calculator.java) class.

Write 9 tests that verify different test cases.

Each different test case will have 1p.

If the code or test code does not compile, the grade is 1.

# Mockito Test (Test 2)

Write 6 tests that verify different test cases.

Test the [GradeService](src/main/java/org/loose/vvs/seleniumtest/services/GradesService.java) where `GradeCalculator` is
the mock.

Each different test case will have 1p.

In the 6 tests mentioned above, use all 3 mocking techniques to test the functionality:
- Mock with anonymous class
- Mock with a separate class
- Mock using Mockito

Each mocking technique used has 1p.

If the code or test code does not compile, the grade is 1.

# Selenium Test (Test 3)

## Introduction

Run the [SeleniumTestApplication](src/main/java/org/loose/vvs/seleniumtest/SeleniumTestApplication.java) class and visit http://localhost:8080/ to see the application running.

## Login

Student
> username: student
>
> password: student

Teacher
> username: teacher
>
> password: teacher

## Requirements
Implement the following 6 test cases:

1. Login for student - 0.5 points
2. As a student, view the details of the subject "SVV" by clicking the details button and get redirected to the
   subject details page - 2 points
3. As a student, filter subjects after "S" - 2 points
4. Login for teacher - 0.5 points
5. As a teacher, view the subjects of the third year using the dropdown - 2 points
6. As a teacher, create a new subject by clicking the "Add" Button from the bottom right corner. Enter the subject name: "MySubject", year: "4" and details: "best new subject" in the popup - 2 points

If the code or test code does not compile, the grade is 1.

# JUnit Mockito Selenium Test (Test 4)

### JUnit - 3p

Test the `calculateMeanFromThreeMaxGrades(List<Double> grades)` method from the [Calculator](src/main/java/org/loose/vvs/seleniumtest/junit/Calculator.java) class.

Write tests to cover 3 different test cases.

### Mockito - 3p

Test the [GradeService](src/main/java/org/loose/vvs/seleniumtest/services/GradesService.java) where `GradeCalculator` is
the mock.

Write 3 different test cases using the mocking methods (anonymous class, separate class, Mockito)

### Selenium - 3p

#### Introduction

Run the [SeleniumTestApplication](src/main/java/org/loose/vvs/seleniumtest/SeleniumTestApplication.java) class and visit http://localhost:8080/ to see the application running.

#### Credentials

Student
> username: student
>
> password: student

Teacher
> username: teacher
>
> password: teacher

1. Login for student
2. As a teacher, create a new subject by clicking the "Add" Button from the bottom right corner. Enter the subject name: "NewSubject", year: "3" and details: "new subject" in the popup.
3. Logout for teacher

If the code or test code does not compile, the grade is 1.