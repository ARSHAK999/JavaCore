package chepter8.Box2;

public class DemoSuper {
    public static  void main(String[] args) {
        Boxweight2 myBox1 = new Boxweight2(10, 20, 15, 34.3);
        Boxweight2 myBox2 = new Boxweight2(2, 3, 4, 0.076);
        Boxweight2 myBox3 = new Boxweight2();
        Boxweight2 myCube = new Boxweight2(3, 2);
        Boxweight2 myClone = new Boxweight2(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 = " + vol);
        System.out.println("Weight of myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 = " + vol);
        System.out.println("Weight of myBox2 = " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 = " + vol);
        System.out.println("Weight of myBox3 = " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone = " + vol);
        System.out.println("Weight of myClone = " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume myCube = " + vol);
        System.out.println("Weight of myCube = " + myCube.weight);
    }
}
