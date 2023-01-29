package chepter6.Box6;

public class BoxDemo {
    public static void main(String[] args) {
        Box6 myBox = new Box6();
        Box6 myBox2 = new Box6();

        double vol;

        vol = myBox.volume();
        System.out.println(vol);

        vol = myBox2.volume();
        System.out.println(vol);
    }
    }
