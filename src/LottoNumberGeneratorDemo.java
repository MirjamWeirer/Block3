import java.util.Random;

public class LottoNumberGeneratorDemo {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps: ");

        ;
        //Verschachtelung von Schleifen
        for (int tipps = 0; tipps < 5; tipps ++){
            System.out.print("Nr. " + tipps + ": " );
            int [] n = cerateOneTipp();

            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i] + ", ");
            }
            System.out.println();
        }
    }
    public static int[] cerateOneTipp(){
        int [] oneTipp = new int[6];
        //for(startwert; bedingung; inkrement) ->wenn man die Durchläufe weis for schleife
        for (int i = 0; i < oneTipp.length; i++) {
            oneTipp[i] = generateOneNumber(45);
        }
        return oneTipp;
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
