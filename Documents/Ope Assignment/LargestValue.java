import java.util.Scanner;

public class LargestValue { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int value1 = input.nextInt();

System.out.print("Enter the second integer: ");
int value2 = input.nextInt();

int largest = value1;
int smallest = value2;

if( value2 > largest) {
largest = value2;
System.out.printf("Largest is:%d", largest);
}

if (value1 == value2) {
System.out.print(0);
} else if (value1 - value2 % 6 == 0){
 smallest = value1;
System.out.printf("Smaller value is:%d", smallest);
}



}
}