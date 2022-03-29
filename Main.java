
public class Main {

    public static void main(String[] args) {

        int counter = 0;
        RandomCharacter ra = new RandomCharacter();
        while(counter < 15){
            System.out.print(counter+1);
            ra.getRandomLowerCaseLetter();
            counter++;
        }
        counter = 0;
        System.out.println("========================================");

        while(counter < 15){
            System.out.print(counter+1);
            ra.getRandomUpperCaseLetter();
            counter++;
        }

        counter = 0;
        System.out.println("========================================");

        while(counter < 15){
            System.out.print(counter+1);
            ra.getRandomDigitCharacter();
            counter++;
        }

        counter = 0;
        System.out.println("========================================");

        while(counter < 15){
            System.out.print(counter+1);
            ra.getRandomCharacter();
            counter++;
        }

        ra.getRandomprime();



    }
}
