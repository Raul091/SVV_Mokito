# Test JUnit (Test 1)

Testati metoda `calculateMeanFromThreeMaxGrades(List<Double> grades)` din clasa [Calculator](src/main/java/org/loose/vvs/seleniumtest/junit/Calculator.java).

Scrieti 9 teste care sa verifice cazuri de test diferite.

Fiecare caz de test diferit este punctat cu 1p.

Daca codul sau codul de test nu compileaza, nota este 1.

# Test Mockito (Test 2)

Scrieti 6 teste care sa verifice cazuri de test diferite.

Testati [GradeService](src/main/java/org/loose/vvs/seleniumtest/services/GradesService.java) unde `GradeCalculator` este mock-ul.

Fiecare caz de test diferit va fi punctat cu 1p.

In cele 6 teste mentionate mai sus, sa se foloseasca toate cele 3 tehnici de mocking pentru a testa functionaltiatea:

- Mock cu clasa anonima
- Mock cu o clasa separata
- Mock folosind Mockito

Fiecare tehnica de mocking utilizata sa puncteaza cu 1p.

Daca codul sau codul de test nu compileaza, nota este 1.

# Test Selenium (Test 3)

## Introducere

Rulati clasa [SeleniumTestApplication](src/main/java/org/loose/vvs/seleniumtest/SeleniumTestApplication.java) si vizitati http://localhost:8080/ pentru a vedea aplicatia ruland.

## Credentiale

Student
> username: student
>
> password: student

Profesor
> username: teacher
>
> password: teacher

## Cerinte
Implementati urmatoarele 6 cazuri de test:

1. Login pentru student - 0.5p
2. Ca student, vizualizarea detaliilor materiei "VVS" facand clic pe butonul de detalii și redirectionarea catre pagina cu detaliile materiei - 2p
3. Ca student, filtrarea materiilor dupa "S" - 2p
4. Login pentru profesor - 0.5p
5. Ca profesor, vizualizarea materiilor din anul 3 folosind dropdown-ul - 2p
6. Ca profesor, crearea unei materii noi facand clic pe butonul "Add" din coltul din dreapta jos. Introduceti numele materiei: "MySubject", anul: "4" si detaliile: "best new subject" in fereastra popup - 2p

Daca codul sau codul de test nu compileaza, nota este 1.

# Test JUnit Mockito Selenium (Test 4)

### JUnit - 3p

Testati metoda `calculateMeanFromThreeMaxGrades(List<Double> grades)` din clasa [Calculator](src/main/java/org/loose/vvs/seleniumtest/junit/Calculator.java).

Scrieti teste pentru a acoperi 3 cazuri de test diferite.

### Mockito - 3p

Testati [GradeService](src/main/java/org/loose/vvs/seleniumtest/services/GradesService.java) unde `GradeCalculator` este mock-ul.

Scrieti 3 cazuri de test diferite folosind metodele de mock (clasa anonima, clasa separata, Mockito).

### Selenium - 3p

#### Introducere

Rulati clasa [SeleniumTestApplication](src/main/java/org/loose/vvs/seleniumtest/SeleniumTestApplication.java) si vizitati http://localhost:8080/ pentru a vedea aplicatia ruland.

#### Credentiale

Student
> username: student
>
> password: student

Profesor
> username: teacher
>
> password: teacher

1. Login pentru student
2. Ca profesor, crearea unei materii noi facand clic pe butonul "Add" din coltul din dreapta jos. Introduceti numele materiei: "NewSubject", anul: "3" si detaliile: "new subject" in fereastra popup.
3. Logout pentru profesor

Daca codul sau codul de test nu compileaza, nota este 1.