public class Practice {
    public int calculate(int a, int b) {
        if (a == 0 && b == 0)
            return 0;
        if (b == 0) {
            return -1;
        }
        if (a > b) {
            return a + b;
        }
        if (a == b)
            return a;

        return a / b;
    }
}