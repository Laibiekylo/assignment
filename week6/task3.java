import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        System.out.print("Enter your guess: ");
        int guess = input.nextInt();
        while( guess != number){
            if(guess > number){
                System.out.print("The input is too high! ");
            }else{
                System.out.print("The input is too low! ");
            }
            guess = input.nextInt();
        }
        System.out.println("Yes, the number is " + guess);
    }
}