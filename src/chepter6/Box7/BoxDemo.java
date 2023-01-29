package chepter6.Box7;

public class BoxDemo {
    public static void main(String[] args) {
        Box7 mybox = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        vol = mybox.volume();
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
    }

