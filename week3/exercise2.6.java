import java.util.Scanner;

public class exercise2_6
{
    public static void main(String[] args)
    {
        final double INTEREST_RATE = 0.05/12;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double sa = input.nextDouble();
        sa *= INTEREST_RATE;
        for (int i = 1; i < 6; i++) {
            sa = INTEREST_RATE * sa + 100;
        }
        System.out.printf("After the sixth month, the account value is: %.3f\n", sa;
    }
}