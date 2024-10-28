import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] nums = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = input.nextDouble();
        }
        double min = findMin(nums);
        System.out.println("The minimum value is " + min);
        input.close();
    }

    public static double findMin(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (number < min) {
                min = num;
            }
        }
        return min;
    }
}