package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int number = input.nextInt();

        int numberIndex = -1;
        for (int index = 0; index < numbers.length; index++) {
            if(number == numbers[index]) {
                numberIndex = index;
            }
        }

        System.out.println("Number index: " + numberIndex);
    }
}
