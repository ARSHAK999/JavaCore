package homwork8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray  nums = new DynamicArray();
        for (int i = 0; i < 20; i++) {
            nums.add(i);
        }
        nums.print();
        System.out.println();
        System.out.println(nums.get(0));
    }
}
