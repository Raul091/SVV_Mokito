import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringConvTest {
    private StringConv stringconv;

    @BeforeEach
    void setup() {
        stringconv = new StringConv();
    }

    @Test
    void StrToIntNormalInput() {
        int strtoint = stringconv.strToInt("123");
        assertEquals(123, strtoint, "This should be 123");
    }

    @Test
    void StrToIntLargeInput() {
        int strtoint = stringconv.strToInt("987654321");
        assertEquals(987654321, strtoint, "This should be 987654321");
    }

   /* @Test
    void StrToIntNullInput() {
        int strtoint = stringconv.strToInt("");

        //NumberFormatException thrown =  assertThrows(NumberFormatException.class, () ->{
        //  stringconv.strToInt("");
        // }, "NumberFormat Exception: invalid input string");

        //assertEquals("NumberFormat Exception: invalid input string", thrown.getMessage());
        //}
        assertEquals(0, strtoint, "This should be 0");
    }*/

    @Test
    void StrToIntNullInput() {
        int strtoint = stringconv.strToInt("");
        assertEquals(0, strtoint, "This should be 0");
    }

    @Test
    void StrToIntInput0(){
        int strtoint =  stringconv.strToInt("0");
        assertEquals(0, strtoint, "This should be 0");
    }

    @Test
    void StrToIntInput1() {
        int strtoint = stringconv.strToInt("1");
        assertEquals(1, strtoint, "This should be 1");
    }

    @Test
    void StrToIntInput8() {
        int strtoint = stringconv.strToInt("8");
        assertEquals( 8, strtoint, "This should be 8");
    }

    @Test
    void StrToIntInvalidInput() {
        int strtoint = stringconv.strToInt("abcd");
        assertEquals("Invalid input", strtoint, "This should return invalid input");
    }
}
