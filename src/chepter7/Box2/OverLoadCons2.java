package chepter7.Box2;

public class OverLoadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10,20,15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(8);

        Box2 myclone = new Box2(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1.volume = " + vol);
        vol = mybox2.volume();
        System.out.println("mybox2.volume = " + vol);
        vol = mycube.volume();
        System.out.println("mycube.volume = " + vol);
        vol = myclone.volume();
        System.out.println("myclone.volume = " + vol);
    }
}
