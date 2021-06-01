import org.apache.log4j.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public long power(int base, int exponent) throws Exception {
        long result = 1;
        if(exponent==0) logger.info("exponent = 0");
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        logger.info("result: "+result);
        return result;
    }
    public long delta(int a, int b, int c) throws Exception {
        long x = 0;
        try{
            x = power(b,2)-4*a*c;
            logger.info("result: "+x);
            
        }catch (Exception e) {
            logger.error("power didn't work");
        }
        return x;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
}