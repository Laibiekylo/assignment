public class task7
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        int j = (int) (Math.random() * 11);
        int i = (int) (Math.random() * 11);
        if (i < j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }

        while (j < 10) {
            j++;
        }
        System.out.println("sum = " + j);
    }
}