import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
    private Practice practice;
    @BeforeEach
    void setup(){
        practice =  new Practice();
    }

    @Test
    void giveBEqualTo0ResultShouldBeOne(){
        int calculate = practice.calculate(3,0);
        assertEquals(-1, calculate, "The result should be -1");
    }

    @Test
    void giveAGreaterThanBShouldBeSum(){
        int calculate = practice.calculate(4, 1);
        assertEquals(5, calculate, "This should be 5");
    }

    @Test
    void giveALessThanBShouldBeDivision(){
        int calculate = practice.calculate(1, 2);
        assertEquals(0, calculate, "This Should be 6");
    }

    @Test
    void giveAandBEqualReturnA(){
        int calculate = practice.calculate(1, 1);
        assertEquals(1, calculate, "This should be 1");
    }

    @Test
    void giveAandBEqualTo0Return0(){
        int calculate = practice.calculate(0, 0);
        assertEquals(0, calculate, "This should be 0");
    }
}
