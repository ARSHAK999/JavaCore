package group1.claswork;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 8, 14, 29, 25, 39, 26, 42, 45, 80};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int x = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > x) ;
            {
                x = array[i];
            }
        }
        System.out.println("max  " + x);


        for (int i = 0; i < array.length; i++) {
            if (x > array[i]);{
                x = array[0];
            }
            }
            System.out.println("min  " + x);
        }
    }




