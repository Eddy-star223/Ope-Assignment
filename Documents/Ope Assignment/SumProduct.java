import java.util.Scanner;

public class SumProduct { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int num1 = input.nextInt();

System.out.print("Enter second integer: ");
int num2 = input.nextInt();

if (num1 > 0 && num2 > 0 || num1 < 0 && num2 < 0) {
   int product = num1 * num2;
System.out.printf("%d", product);

}

}
}
