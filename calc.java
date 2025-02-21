package calculatrice;

public class calc {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double mutiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("division sur 0");
        }
        return a / b;
    }
    
}
