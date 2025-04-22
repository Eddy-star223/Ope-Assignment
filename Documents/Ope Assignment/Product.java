import java.util.Scanner;

public class Product {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the first number: ");
int number1 = input.nextInt();

System.out.print("Enter the second number: ");
int number2 = input.nextInt();

int product = number1 * number2;

System.out.printf("The product of two numbers is:%d", product);
}
}