import java.util.Scanner;

public class exercise2_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance to drive: ");
        double drivingDistance = sc.nextDouble();
        System.out.println("Enter miles per gallon:" );
        double milesPerGallon = sc.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = sc.nextDouble();
        double gallon = drivingDistance / milesPerGallon;
        double price = pricePerGallon * gallon;
        System.out.println("The price is $ $%.2f\n" + price);

    }
}