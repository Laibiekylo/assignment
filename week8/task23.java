import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
            int number = scanner.nextInt();
            numbers.add(number);
        }
        scanner.close();
        System.out.println("The numbers in reverse order are:");
        Collections.reverse(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}