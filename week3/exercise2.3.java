import java.util.Scanner;
import java.text.DecimalFormat;

public class exercise2_3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = scan.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = scan.nextDouble();
        weight=weight*0.45359237;
        height=height*0.0254;

        double BMI = weight / (height * height);

        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String formattedBMI = decimalFormat.format(BMI);


        System.out.println("BMI is "+ formattedBMI);

    }
}