package homwork9;

public class Stack {
    int array[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("tos filled");
        }
        array[++tos] = item;
    }

    int pop() {
        if (tos == -1) {

        }
        return array[tos--];
    }
    public boolean isEmpty(){
        return  tos == -1;
    }
}
