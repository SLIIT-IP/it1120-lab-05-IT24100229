import java.util.Scanner;
public class IT24100229Lab5Q1 {
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);


    System.out.print("Enter the First integer: ");
        int num1= input.nextInt();	
	System.out.print("Enter the Second integer: ");
        int num2 = input.nextInt();
	System.out.print("Enter the Third integer: ");
        int num3 = input.nextInt();

     int smallest = num1;
	 if(num2 < smallest) { smallest = num2; }
     if(num3 < smallest) { smallest = num3; }

     int largest = num1;
     if (num2 > largest) { largest = num2; }
     if(num3 > largest) { largest = num3; }
	 
	 System.out.println("Smallest number is: " + smallest);
     System.out.println("Largest number is: " + largest);	 
    }
}