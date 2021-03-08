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
        while (checkNumbers <= 1234){ //Abbruchbedingung noch nicht sicher evtl. variable auf falsch gesetzt im code etc.
            if (isPrim(checkNumbers)){
                System.out.print(checkNumbers + ", ");
            }
            checkNumbers ++;
        }

        //for(initialisierung; bedingung; increment)
        /*for(int i = 1; i < 1000; i++){ //verwendet strikt hochgezählt wird

        }
        */
    }
    public static boolean isPrim (int number) {
        //int checkValue = 2;
        // boolean checkIsPrim = true;
        /*while (checkValue < number / 2){ //Code optimierung nur bis zu hälfte wird gerechnet oder über Wurzel mit Math.sqrt(number))
            if (number % checkValue == 0){
                //checkIsPrim = false;
                //break;//bricht Schleife ab
                return false; //Bricht schleife ab
            }
            checkValue ++;
         }
        */
        for (int checkValue = 2; checkValue < number / 2; checkValue++) {
            if (number % checkValue == 0) {
                return false;
            }
        }

        //return checkIsPrim;
        return true;
    }
}