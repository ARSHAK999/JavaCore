package homwork8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray  dy = new DynamicArray();
        for (int i = 0; i < 20; i++) {
            dy.add(i);
        }
        dy.print();
        System.out.println();
        System.out.println(dy.get(0));
    }
}
