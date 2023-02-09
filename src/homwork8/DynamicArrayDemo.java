package homwork8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray  dy = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            dy.add(i + 1);
        }
        dy.print();
        System.out.println();
        System.out.println(dy.get(0));


        dy.deleteByIndex(4);
        dy.print();

        System.out.println();
        dy.set(3,88);
        dy.print();
        System.out.println();

        dy.print();
        dy.add(5,99);


        System.out.println(dy.exists(8));
        System.out.println(dy.getIndexByValue(7));


    }

}
