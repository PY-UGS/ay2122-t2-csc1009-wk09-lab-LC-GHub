import org.junit.Before;

import java.util.Random;



public class RandomCharacter {

    private char RandomLowerCaseLetter;
    private char RandomUpperCaseLetter;
    private char RandomDigitLetter;
    private char RandomCharacter;
    private int prime;
    private int choice;

    Random generator = new Random();
    public char getRandomLowerCaseLetter(){


        this.RandomLowerCaseLetter = (char)(generator.nextInt(26) + 'a');
        System.out.println(". Random lower case is: " + this.RandomLowerCaseLetter);
        return this.RandomLowerCaseLetter;

    }

    public char getRandomUpperCaseLetter(){

        this.RandomUpperCaseLetter = (char)(generator.nextInt(26) + 'A');
        System.out.println(". Random upper case is: " + this.RandomUpperCaseLetter);
        return this.RandomUpperCaseLetter;

    }

    public char getRandomDigitCharacter(){

        this.RandomDigitLetter = (char) (generator.nextInt(9) + '0');
        System.out.println(". Random digit is "+ this.RandomDigitLetter);
        return this.RandomDigitLetter;
    }

    public char getRandomCharacter(){
        this.RandomCharacter = (char)(generator.nextInt(32) + 95);
        System.out.println(". Random char is "+this.RandomCharacter);
        return this.RandomCharacter;
    }

    public int getRandomprime(){
        boolean isprime = false;
        while(isprime == false){
            this.prime = generator.nextInt(100);
            for(int p = 2; p <= (int)this.prime/2; p++){
                if(this.prime % p == 0){
                    isprime = false;
                    break;
                }else{
                    isprime = true;

                }
            }
        }

        System.out.println("Random prime number is: " + this.prime);
        return this.prime;
    }


}
