import java.util.Scanner;

public class task9
{
    public static void main(String[] args)
    {
        System.out.println("Enter the monthly saving amount:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();
        double saving = sc.nextDouble();
        double value = saving;
        for (int i = 0; i <months; i++) {
           value = (value + saving) * (1 + (0.05/12));
        }
        value -= saving;
        System.out.println("After the first month, the account value is $");
        System.out.printf("%f", value);
    }
}