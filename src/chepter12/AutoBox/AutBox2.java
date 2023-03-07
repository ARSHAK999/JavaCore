package chepter12.AutoBox;

public class AutBox2 {
    static int m(Integer value){
        return value;
    }

    public static void main(String[] args) {
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
