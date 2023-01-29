package chepter6.Box5;

public class BoxDemo {
    public static void main(String[] args) {
        Box5 mybox = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        mybox.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        vol = mybox.volume2();
        System.out.println(vol);

        vol = mybox2.volume2();
        System.out.println(vol);


    }
    }

