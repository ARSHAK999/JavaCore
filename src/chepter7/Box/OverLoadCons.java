package chepter7.Box;

public class OverLoadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("obiem mybox1 >" + vol);
        vol = mybox2.volume();
        System.out.println("obiem mybox2 >" + vol);
        vol = mycube.volume();
        System.out.println("obiem mycube > " + vol);
    }

}
