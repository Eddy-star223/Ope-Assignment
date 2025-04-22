// importing of Scanner
// Declare my class and identifier
// Main method begin execution
// Prompt the user to enter weight of the package
// Initialize variable
import java.util.Scanner;

public class CostOfShipping1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the weight of the package: ");
int weight = input.nextInt();

double weight1 = 3.5;
double weight2 = 5.5;
double weight3 = 8.5;
double weight4 = 10.5;
int greater = 50;

if (weight > 1) {
  System.out.printf("The shipping cost is:%f", weight1);
}

if (weight > 3) {
  System.out.printf("The shipping cost is:%f", weight2);
}

if (weight > 10) {
  System.out.printf("The shipping cost is:%f", weight3);
}

if (weight > 20) {
  System.out.printf("The shipping cost is:%f", weight);
}

if (weight > 50) {
   System.out.printf("The package cannot be shipped);
}  



}
} 