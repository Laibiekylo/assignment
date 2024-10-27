public class task13
{
    public static void main(String[] args)
    {
        double pay = 50000;
        int score = 92;

        if (score > 90) {
            pay *= 1.03;
        } else {
            pay *= 1.01;
        }

        System.out.println("New pay is: " + pay);
    }
}