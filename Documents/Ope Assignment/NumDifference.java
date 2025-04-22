import java.util.Scanner;

public class NumDifference {
public static void main(String[] agrs) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int num1 = input.nextInt();

System.out.print("Enter second integer: ");
int num2 = input.nextInt();

int diff = num1 - num2;

if (num1 > num2) {
    System.out.printf("The difference is: %d ", diff);
}






}
}