package group1.claswork.homework1;

public class FigurePainte2 {
    public static void main(String[] args) {
        System.out.println("Figure 1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Figure 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}






