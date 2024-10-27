import java.util.Scanner;

public class execrise2_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);

        double total = subtotal + gratuity;
        System.out.printf("Gratuity: $%.2f%n", gratuity);
        System.out.printf("Total: $%.2f%n", total);

        input.close();
    }
}