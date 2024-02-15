package src;

public class ArrayMeanImpl {

    public static void findAverage(Integer[] nums) {

        int sum = 0;
        int average = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        average = sum / i;
        System.out.println("Total sum: " + sum);
        System.out.println("Average: " + average);
    }
}