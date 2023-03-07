package chepter10.MyExpection;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "myException[" + detail + "]";
    }
}
