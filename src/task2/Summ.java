package task2;

import java.util.Scanner;

public class Summ {
    public static void CalculateSum() {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        System.out.println("Введите второе число");
        int number2 = scan.nextInt();
        System.out.println(number1+number2);

    }
}
