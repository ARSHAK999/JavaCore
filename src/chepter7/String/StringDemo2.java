package chepter7.String;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String str0b2 = "Вторая строка";
        String strObЗ = strOb1;


        System.out.println("Длина строки strOЫ: " +
                strOb1.length());
        System.out.println("Cимвoл по индексу З "
                + strOb1.charAt(3));
        if (strOb1.equals(str0b2))
            System.out.println("strOЫ strOb2");
        else
            System.out.println("strOЫ != strOb2");
        if (strOb1.equals(strObЗ))
            System.out.println("strOЫ strObЗ");
        else
            System.out.println("strOЫ != strOb3");
    }
}
