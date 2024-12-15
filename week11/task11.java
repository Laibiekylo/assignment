import java.util.Arrays;
public class task11
{
    public static void main(String[] args) {
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 3, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sum += workHours[i][j];
            }
            totalHours[i] = sum;
        }

        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = 0; j < totalHours.length - 1 - i; j++) {
                if (totalHours[j] < totalHours[j + 1]) {
                    int tempTotal = totalHours[j];
                    totalHours[j] = totalHours[j + 1];
                    totalHours[j + 1] = tempTotal;

                    int[] tempRow = workHours[j];
                    workHours[j] = workHours[j + 1];
                    workHours[j + 1] = tempRow;
                }
            }
        }

        for (int i = 0; i < workHours.length; i++) {
            System.out.print("Employee " + i + " total hours: " + totalHours[i] + " - ");
            for (int j = 0; j < workHours[i].length; j++) {
                System.out.print(workHours[i][j] + " ");
            }
            System.out.println();
        }
    }
}