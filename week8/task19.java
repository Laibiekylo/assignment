
public class Week8Task19 {
    public static void main(String[] args) {
        printmax(1,3,5,7);

        printmax(new double[]{1,3,5,7});

    }
    public static void printmax(double... arr) {
        if(arr == null || arr.length == 0){
            System.out.println("The array is empty");
            return;
        }
        double max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max value is " + max);
    }
}