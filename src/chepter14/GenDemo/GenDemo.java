package chepter14.GenDemo;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value : " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Test");
        strOb.showType();

        String str = strOb.getOb();
        System.out.println("value : " + str);
    }
}
