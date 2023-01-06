package group1.claswork;

public class ArrayUntil {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 9, 22, 35, 48, -15, 50, 0, 99, -9, 7, 17, -8};

        System.out.print("Զույգ թվերն են ");
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                a++;
            }

        }
        int b = 0;
        System.out.println();
        System.out.print("Կենտ թվերն են  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 | array[i] % 2 == -1) {
                System.out.print(array[i] + " ");
                b++;
            }
        }
        System.out.println();
        System.out.println("Զույգ թվերի քանակը ՝ " + a);
        System.out.println("կենտ թվերի քանկը ՝ " + b);

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num = array[i] + num;
        }
        System.out.println("Միջին թվաբանականը" + num / array.length);
        System.out.println("Բոլոր թվերի գումարը " + num);
        System.out.println("Մջտեղի անդամը " + array[array.length / 2]);
        System.out.println("Առաջին անդամը " + array[0]);
        System.out.println("Վերջին անդամը " + array[array.length - 1]);

    }
}
