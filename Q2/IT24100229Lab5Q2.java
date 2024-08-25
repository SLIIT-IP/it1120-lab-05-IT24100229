import java.util.Scanner;

public class IT24100229Lab5Q2{
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of new members introduced: ");
  int numberOfnewmembers = input.nextInt();
   
   String prize;
   if(numberOfnewmembers < 0 )
{
  System.out.println("Input must be a number 0 or greater");
              return;
     } 
  switch(numberOfnewmembers){
   case 0:
    
  }
  
  switch (numberOfnewmembers) {
   case 0:
    System.out.println("Prize is a: No Prize");
    break;
   case 1:
    System.out.println("Prize is a: Pen");
    break;
   case 2:
    System.out.println("Prize is an: Umbrella");
    break;
   case 3:
    System.out.println("Prize is a: Bag");
    break;
   case 4:
    System.out.println("Prize is a: Traveling Chair");
    break;
    default:
    System.out.println("Prize is a: Headphone");
}
  }

}