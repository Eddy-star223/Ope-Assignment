// import Scanner
// Convert from U.S. dollars to Chinese RMB
// Convert from Chinese RMB to U.S. dollars

import java.util.Scanner;

public class CurrencyExchange {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter exchange rate from U.S to chinese RMB: ");
Double exchangeRate = input.nextDouble();

System.out.print("Enter 0 to convert from U.S. dollars to Chinese RMB, or 1 to convert from Chinese RMB to U.S. dollars:");
int convert = input.nextInt();



if (convert == 0) {          
System.out.print("Enter the amount in U.S. dollars: ");
double amount = input.nextDouble();

double convertInChinese = amount * exchangeRate;
System.out.printf("The amount in Chinese RMB is %.2f%n", convertInChinese);
 
} else if (convert == 1) {            
System.out.print("Enter the amount in Chinese RMB: ");
double amount = input.nextDouble();

double convertInUs = amount / exchangeRate;
System.out.printf("The amount in U.S. dollars is %.2f%n", convertInUs);

} 

 
  }
}