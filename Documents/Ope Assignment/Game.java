import java.util.Scanner;
import java.util.Random;

public class Game {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random ran1 = new Random();


System.out.print("Heads (0), tails(1): ");
int guess = input.nextInt();

int guessRan1 = ran1.nextInt(2);


if (guess == guessRan1) {
System.out.print("correct");
} else if () {
System.out.print("Invalid Number");
} 



}
}