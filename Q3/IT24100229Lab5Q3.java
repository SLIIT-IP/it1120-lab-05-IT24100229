import java.util.Scanner;

public class IT24100229Lab5Q3{
 public static void main(String[] args){
  
  final int roomchargeperday =48000;
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Start Date (1-31): ");
  int startdate = input.nextInt();
  
  System.out.print("End Date (1-31): ");
  int enddate = input.nextInt();
  
  if((startdate<1) || (startdate>31) || (enddate<1) || (enddate>31)){
   System.out.println("Error: Days must be between 1 and 31.");
   return;
  }
  
  
  if(enddate<=startdate){
   System.out.println("Error: Start Date must be less than End Date.");
   System.exit(0);
  }
  
  int numberofdays = enddate-startdate;
  double totalcost= (double) numberofdays * roomchargeperday;
  double discount=0;
  
  if(numberofdays<3){
   discount=0;
  }else if((numberofdays<=3) || (numberofdays<=4)){
   discount=10;
  }else if(numberofdays>=5){
   discount=20;
  }
  
  System.out.println("Room Charge Per Day: Rs. "+roomchargeperday+"/=");
  System.out.println("Number of Days Reserved: "+numberofdays);
  System.out.println("Total Amount to be Paid: "+(totalcost*((100-discount)/100)));
  
 }
}