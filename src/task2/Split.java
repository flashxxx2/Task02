package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Split {

    public static void SplitNumber() {
        System.out.println("Ведите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String s = Integer.toString(number);
        char[] charArray = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            list.add(c);
        }
        int sum =0;
        for (int i: list) {
            sum += i;

        }
            System.out.println("Сумма цифр равна - " + sum);

        }

    }




