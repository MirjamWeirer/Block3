import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {

       int [] arr = new int[7];
       arr[0] = 9;
       arr[1] = 8;
       arr[2] = 7;
       arr[3] = 6;
       arr[4] = 5;
       arr[5] = 4;
       arr[6] = 3;

       int [] arr2= {6,2,5, 1, 8};

       arrangeOrder(arr);
       System.out.println(Arrays.toString(arr));

       arrangeOrder(arr2);
        System.out.println(Arrays.toString(arr2));

       /*for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + ", ");
       } */
    }

    public static void arrangeOrder (int [] numbers){

        System.out.println( "Länge = " + numbers.length);

        boolean hasChanged = true;
        while (hasChanged == true) {
            hasChanged = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    hasChanged = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }
}

