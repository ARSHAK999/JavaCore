package homwork8;

import static jdk.nashorn.internal.objects.NativeJava.extend;

public class DynamicArray {
    private int[] array = new int[10];
    private  int size ;

    public void add(int item){
        if(size == array.length){
            extend();
        }
        array[size++] = item;
    }

    private void extend() {
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

