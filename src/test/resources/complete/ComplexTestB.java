public class ComplexTestB {
    public String method(int a, int b) {
        int c = method2(a);
        return c + b;
    }

    public String method2(int b) {
        return b + 2;
    }
}