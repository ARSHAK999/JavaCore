package chepter8.UseSuper;

public class B extends A {
    int i;
    B(int a, int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("Члeн i в суперклассе: "+ super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}
