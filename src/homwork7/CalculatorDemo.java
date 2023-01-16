package homwork7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator result = new Calculator();

        int sum = result.plus(20, 10);
        System.out.println("plus : " + sum);

        sum = result.minus(5, 55);
        System.out.println("minus : " + sum);

        sum = result.divide(500, 2);
        System.out.println("divide : " + sum);

        sum = result.multiply(40, 4);
        System.out.println("multiply : " + sum);
    }
    }

