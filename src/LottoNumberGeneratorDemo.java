import java.util.Random;

public class LottoNumberGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps: ");

        System.out.println(generateOneNumber(45));
        System.out.println(generateOneNumber(45));
        System.out.println(generateOneNumber(45));
        System.out.println(generateOneNumber(45));
        System.out.println(generateOneNumber(45));
        System.out.println(generateOneNumber(45));


    }

    public static int generateOneNumber(int range){
        Random random = new Random(); //Random = Klasse; zufall
        int value = (random.nextInt() % range) + 1;
        if (value < 0){
            value = value * -1;
        }

        return value;
    }
}
