import java.util.Scanner;
public class task8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();
        double ar=(3 * Math.sqrt(3) / 2);
        double area =ar * side * side;
        System.out.println("The area of the hexagon is " + area);
    }

}