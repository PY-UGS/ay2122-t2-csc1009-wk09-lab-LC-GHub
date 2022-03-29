import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {

    RandomCharacter randomtest = new RandomCharacter();

    @Test
    public void getRandomLowerCaseLettertest() {
        char output = randomtest.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
        assertTrue((int)output >= 97 && (int)output <=122);

    }

    @Test
    void getRandomUpperCaseLetter() {
        char output = randomtest.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
        assertTrue((int)output >= 65 && (int)output <=90);
    }

    @Test
    void getRandomDigitCharacter() {
        char output = randomtest.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
        assertTrue(output -'0' <= 9);
        assertTrue(output - '0' >=0 );
    }

    @Test
    void getRandomCharacter() {
        char output = (char)randomtest.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
        assertTrue((int)output  <= 127);
        assertTrue((int)output  >= 95);
    }

    @Test
    void getRandomprime() {
        int output = randomtest.getRandomprime();
        boolean isprime = true;
        for(int p = 2; p <= (int)output/2; p++){
            if(output % p == 0){
                isprime = false;
                break;
            }else{
                isprime = true;
            }
        }

        assertTrue(isprime);

    }

}