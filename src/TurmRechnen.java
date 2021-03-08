public class TurmRechnen {
    public static void main(String[] args) {

        long number = 202103;
        for (int i = 2; i <= 9; i++) {
            System.out.println(number + " * " + i);
            number = number * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(number + " / " + i);
            number = number / i;
        }
    }
}
