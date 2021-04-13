public class Calculator {
    public long power(int base, int exponent) throws Exception {
        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        return result;
    }
    public long delta(int a, int b, int c) throws Exception {
        return power(b,2)-4*a*c;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}