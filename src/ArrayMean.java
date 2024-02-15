package src;

import java.util.Scanner;

public class ArrayMean {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Integer[] dataArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            dataArray[i] = Integer.valueOf(scanner.nextLine());
        }

        scanner.close();

        ArrayMeanImpl.findAverage(dataArray);
    }


}

