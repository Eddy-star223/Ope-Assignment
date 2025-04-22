import java.util.Scanner;

public class SumCalculator { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = input.nextInt();
if (num1 < 0) {
System.out.println("Error");
}

System.out.print("Enter the second integer: ");
int num2 = input.nextInt();

int sum = num1 + num2;
int product = num1 * num2;
double average = sum / 2;
int distance = num1 - num2;

int max = num1;
int min = num2;

System.out.printf("%d%d%f%d", sum, product, average, distance);


if (num1 > max) {
num1 = max;
System.out.printf("%d", num2);
} else if(num2 < min) {
num2 = min;
System.out.printf("%d", num2);
}


}
}