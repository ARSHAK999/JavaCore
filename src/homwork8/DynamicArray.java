package homwork8;

import static jdk.nashorn.internal.objects.NativeJava.extend;

public class DynamicArray {
    private int[] array = new int[10];
    private  int size = 0 ;

    public void add(int item){
        if(size == array.length){
            extend();
        }
        array[size++] = item;
    }

    private void extend() {
        int array2[] = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];

        }
        array = array2;
    }

    public int get(int index){
        if (index >= array.length) {
            return -1;
        }
        return array[index];
        }
        public  void print(){
            for (int i : array) {
                System.out.print(i + " ");

            }
        }
}

