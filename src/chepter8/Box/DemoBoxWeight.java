package chepter8.Box;



public class DemoBoxWeight {
    public static void main(String[] args) {
        Boxweight mybox1 = new Boxweight();
        Boxweight mybox2 = new Boxweight();
        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox1.weight);
        System.out.println();
    }
}
