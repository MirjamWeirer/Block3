import java.util.Arrays;

public class ExamplesWithArrays {
    public static void main(String[] args) {


        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };

        System.out.println("arr.length = " + arr.length);
        System.out.println(findSmallestNr(arr));
        System.out.println(findBiggestNr(arr));
        System.out.println(findSumme(arr));
        System.out.println(findAverage(arr));
        //System.out.println(Arrays.toString(findDubbleArray(arr)));
        System.out.println(Arrays.toString(DuplicatedArray(2,3,20)));
        //System.out.println(Arrays.toString(duplicatedArrayMultiplication(arr)));
        System.out.println(Arrays.toString(duplicates(arr)));

    }

    // TODO 1: Write a method, finding and returning the smallest number
    public static int findSmallestNr (int[] arr){
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < keep){
                keep = arr[i];
            }
        }
        return keep;
    }
    // TODO 2: Write a method, finding and returning the biggest number
    public static int findBiggestNr (int[] arr){
        int keep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > keep){
                keep = arr[i];
            }
        }
        return keep;
    }
    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    public static int findSumme (int[] arr){
        int summe=0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + arr[i];
        }
        return summe;
    }
    // TODO 4: Write a method, calculating and returning the average over all numbers
    public static  int findAverage (int [] arr){
        int average = findSumme(arr) / arr.length;
        return average;
    }

    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)
    public static int [] findDubbleArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }

    public static int[] DuplicatedArray (int a, int b, int size){
        int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                if (i % 2 == 0) {
                    result[i] = a;
                } else {
                    result[i] = b;
                }
            }
        return result;
    }

    //Doubles every item to the array
    public static int[] duplicatedArrayMultiplication ( int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    //First, find number oft dupiclates. Then create array with the right size and fill it with these duplicates
    public static int[] duplicates (int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0+i; j < numbers.length - 1; j++){
                if (i !=j){
                    if (numbers[i] == numbers[j]){
                        counter++;
                    }
                }
            }
        }
        int[] duplicates = new int[numberOfDuplicates(numbers)];
        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1+i; j < numbers.length - 1; j++){
                if (i != j){
                    if (numbers[i] == numbers[j]){
                        duplicates[counter] = numbers[i];
                        counter++;
                    }
                }
            }
        }
        return  duplicates;
    }

    //Method to find number of duplicates in array
    public static int numberOfDuplicates (int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0+i; j < numbers.length - 1; j++){
                if (i != j ){
                    if (numbers[i] == numbers[j]){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}


