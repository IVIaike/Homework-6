public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 6.1");

        for (int i=0; i<10; i++) {
            System.out.println("Итерация " + i);
        }

        //Задание 2
        System.out.println("Задание 6.2");
        for (int i=10; i>0; i--) {
            System.out.println("Итерация " + i);
        }

        //Задание 3
        System.out.println("Задание 6.3");
        for (int i=0; i<17; i=i+2) {
            System.out.println("Итерация " + i);
        }

        //Задание 4
        System.out.println("Задание 6.4");
        for (int i=10; i>-10; i--) {
            System.out.println("Итерация " + i);
        }

        //Задание 5
        System.out.println("Задание 6.5");

        for (int i=1904; i<2100; i=i+4) {
            System.out.println(i + " год является високосным.");
        }

        //Задание 6
        System.out.println("Задание 6.6");

        for (int i=7; i<100; i=i+7) {
            System.out.println("Числовая последовательность " + i);
        }

        //Задание 7
        System.out.println("Задание 6.7");

        int i=1;
        for (i=1; i<=512; i=i*2) {
            System.out.println("Числовая последовательность " + i);
        }

    }
}