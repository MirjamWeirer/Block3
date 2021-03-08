import java.util.Random;

public class LottoNumberGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps: ");

        //Verschachtelung von Schleifen
        for (int tipps = 0; tipps < 5; tipps ++){
            gerateOneTipp();
        }
    }
    public static void gerateOneTipp(){
        for (int i = 0; i < 6; i++) {
            System.out.print(generateOneNumber(45)+ ", ");
        }
        System.out.println();
    }

    public static int generateOneNumber(int range){
        Random random = new Random(); //Random = Klasse; zufall
        int randValue = random.nextInt();

        if (randValue < 0){
            randValue = randValue * -1;
        }

        int value = (randValue % range) + 1;
        return value;
    }
}
