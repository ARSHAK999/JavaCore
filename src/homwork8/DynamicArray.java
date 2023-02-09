package homwork8;

import static jdk.nashorn.internal.objects.NativeJava.extend;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int item) {
        if (size == array.length) {
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

    public int get(int index) {
        if (index >= array.length) {
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i : array) {
            System.out.print(i + " ");

        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];

        }
        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index > size - 1) {
            System.out.println("Index");
            return;
        }
        array[index] = value;
    }
    public void add(int index,int value){
        if (index < 0 || index > size -1){
            System.out.println("index");
            return;
        }
        if (size == array.length){
            extend();
        }
        for (int i = size; i >index; i--){
            array[i] = array[i-1];
        }
        array[index] = value;
        size++;
    }
    public  boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }
    public int getIndexByValue(int value){
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                return i;
            }

        }
        return  -1;
    }
    }