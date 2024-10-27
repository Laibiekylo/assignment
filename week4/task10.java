import java.util.Scanner;
public class task10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double mi = 0.05 / 12;
        double accountValue = 0;
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                accountValue = monthlySaving * (1 + mi);
            } else {
                accountValue = (accountValue + monthlySaving) * (1 + mi);
            }
        }
        System.out.println("After the sixth month, the account is $" + accountValue);
    }
}