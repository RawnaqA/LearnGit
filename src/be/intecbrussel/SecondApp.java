package be.intecbrussel;
import java.util.Scanner;
public class SecondApp {
    public static void main(String[] arge) {
        int number1;
        int number2;
        Scanner keyboardReader = new Scanner(System.in);
        System.out.println("Hey, gimme a number.");
        number1 = keyboardReader.nextInt();
        System.out.println("Thx, now give me another!");
        number2 = keyboardReader.nextInt();
        double sum = number1 + number2;
        boolean isGreaterThan100 = sum > 100;
        boolean trueBool = true;
        boolean falseBool = false;
        System.out.println(isGreaterThan100);
        char character = 'T';
        System.out.println((char)(character+5));
    }
}