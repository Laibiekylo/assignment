import java.util.Scanner;

public class task13
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a hexadecimal number: ");
        String hexNumber = scanner.nextLine();
        int decimalNumber = hexToDecimal(hexNumber);
        System.out.println("Decimal number: " + decimalNumber);
    }

    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }
}