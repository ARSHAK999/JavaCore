package chepter7;

public class OverLoadDemo {
    void test() {
        System.out.println("parametr net");

    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);

    }
    double test (double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}



