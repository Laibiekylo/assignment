public class task18
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int year= input.nextInt();
        boolean leapYear=(year %4==0);
        leapYear=leapYear &&(year %100!=0);
        leapYear=leapYear||(year %400==0);
        leapYear=(year %4==0&& year %100!=0)||(year %400==0);

    }
}