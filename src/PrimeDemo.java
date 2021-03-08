 public class PrimeDemo {
    public static void main(String[] args) {
        System.out.println("isPrim(31) = " + isPrim(31));
        System.out.println("isPrim(42) = " + isPrim(42));
        System.out.println("isPrim(9961) = " + isPrim(9961));
        System.out.println("isPrim(906847) = " + isPrim(906847));
        System.out.println("isPrim(999983) = " + isPrim(999983));
        System.out.println("isPrim(1991999993) = " + isPrim(1991999993));
        System.out.println("isPrim(500) = " + isPrim(500));

        int checkNumbers = 2;
        while (checkNumbers <= 1234){
            if (isPrim(checkNumbers)){
                System.out.print(checkNumbers + ", ");
            }
            checkNumbers ++;
        }
    }
    public static boolean isPrim (int number){
        int checkValue = 2;
        // boolean checkIsPrim = true;
        while (checkValue < number){
            if (number % checkValue == 0){
                //checkIsPrim = false;
                //break;//bricht Schleife ab
                return false; //Bricht schleife ab
            }
            checkValue ++;
        }
        //return checkIsPrim;
        return  true;
    }
}
