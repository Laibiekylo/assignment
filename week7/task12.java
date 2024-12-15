import java.util.Calendar;
import java.util.Scanner;

public class task12
{
    public static void main(String[] args) {
        int year, month;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
            return;
        }

        displayCalendar(year, month);
    }

    public static void displayCalendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= numberOfDaysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}