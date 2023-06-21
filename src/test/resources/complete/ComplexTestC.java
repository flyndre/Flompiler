public class ComplexTestC {
    public String method(int a) {
        if (a > 10 || a <= 0) {
            a = 10;
        }
        while (a > 0) {
            a -= 1;
        }
    }
}