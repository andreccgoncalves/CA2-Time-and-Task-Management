package CA2TimeandTask;

import java.util.Scanner;

public class Ca2_timeAndTask {
    
//Method done by Andre Goncalves    
static void calculator_sum(){
System.out.println("Please enter a number");
Scanner myKb = new Scanner(System.in);
int num1 = myKb.nextInt();
System.out.println("Please enter another number");
int num2 = myKb.nextInt();
System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
}
//Method done by Andre Goncalves
static void caclulator_multiplication(){
System.out.println("Please enter a number");
Scanner myKb = new Scanner(System.in);
int num1 = myKb.nextInt();
System.out.println("Please enter another number");
int num2 = myKb.nextInt();
System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
}
//Method done by Gantogtokh Battumur
static void caclulator_division(){
System.out.println("Please enter a number");
Scanner myKb = new Scanner(System.in);
int num3 = myKb.nextInt();
System.out.println("Please enter another number");
int num4 = myKb.nextInt();
System.out.println("The division between " + num3 + " and " + num4 + " is " + (num3 / num4));
}
//Method done by Frank Willian
static void caclulator_subtractionFrankWillian(){
System.out.println("Please enter a number");
Scanner myKb = new Scanner(System.in);
int num1 = myKb.nextInt();
System.out.println("Please enter another number");
int num2 = myKb.nextInt();
System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
}
//Method done by Paula Priscila
static void whoareyou(){

BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
  
try{
       String name1 = name.readLine();
       System.out.println(" LOVELY NAME " + name1);
  }catch(Exception e){
    
}
}
public static void main(String[] args) {
System.out.println("Hello World! - Andre Goncalves, Brazil ");
System.out.println("Hello World! Lucas Gustavo, Brazil ");
System.out.println("Hello World! Gantogtokh Battumur, Mongolia ");
System.out.println("Hello World! Frank Willian Brazil, Brazil ");
System.out.println("Hello World! Paula Priscila, Brazil ");
    
calculator_sum();
caclulator_multiplication();
caclulator_division();
caclulator_subtractionFrankWillian();
whoareyou();
}
}











