public class AccountCalculation {
    public static void main(String[] args) {
        double startCapital = 1000.0;
        double result;
        for (int i = 1; i <= 10 ; i++) {
            result = startCapital * 1.015;
            if (i <= 9){
                System.out.println("End of " + i + " year " + startCapital + " -> " + result);
            }
            else {
                System.out.println("End of " + i + " year " + startCapital + " -> " + result);
                System.out.println("Total: " + result);
            }
            startCapital = result;
        }
    }
    //todo in methode schreiben
    //das startkapital, jahre, zinsen verändert werden können
}
