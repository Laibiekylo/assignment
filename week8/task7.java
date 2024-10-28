public class task7 {
    public static void main(String[] args) {
        float[] mylist = new float[5];

        for (int i = 0; i < 5; i++) {
            mylist[i] = (float) Math.random()*10;
        }
        System.out.println(mylist);

        float max = mylist[0];
        int indexofmax = 0;
        for (int i = 0; i < 5; i++) {
            if (max < mylist[i]) {
                max = mylist[i];
                indexofmax = i;
            }
        }
        System.out.println("largest is the" + max);
        System.out.println("the index is"+indexofmax);

    }
}