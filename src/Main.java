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

        for (int year=1904; year<=2096; year++) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год является високосным.");
        }

        //Задание 6
        System.out.println("Задание 6.6");

        for (int i=7; i<100; i=i+7) {
            System.out.println("Числовая последовательность " + i);
        }

        //Задание 7
        System.out.println("Задание 6.7");

        int z=1;
        for (z=1; z<=512; z=z*2) {
            System.out.println("Числовая последовательность " + z);
        }

        //Задание 8 и 9
        System.out.println("Задание 6.8_6.9");

        int savings = 29000;
        int total = 0;
        for (int y=1; y<=12; y++) {
            total = total + total/100;   // эта строка - решение для задачи 6.9. Для вывода решения задачи 6.8 строку закомментровать
            total = total + savings;
            System.out.println("Месяц " + y + ", сумма накоплений равна " + total + " рублей.");
        }

    }
}