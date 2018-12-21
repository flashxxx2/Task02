package task2;

import java.util.Scanner;

public class ShowInRange {
    public static void CalculateInRange() {
        System.out.println("Веедите минимальное число");
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        System.out.println("Веедите максимальное число");
        int max = scan.nextInt();
        for (int i = min; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }
    }

}
