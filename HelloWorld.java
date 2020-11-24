package CA2TimeandTask;

import java.util.Scanner;


public class Ca2_timeAndTask {
    
    
static void calculator_sum(){
System.out.println("Please enter a number");


Scanner myKb = new Scanner(System.in);
int num1 = myKb.nextInt();

System.out.println("Please enter another number");
int num2 = myKb.nextInt();

System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));

}


static void caclulator_multiplication(){
    
System.out.println("Please enter a number");


Scanner myKb = new Scanner(System.in);
int num1 = myKb.nextInt();

System.out.println("Please enter another number");
int num2 = myKb.nextInt();

System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));

}
    
static void GantogtokhMethod(){
    System.out.println("My name is Gantogtokh Battumur, this is my code");
 }   
    
public static void main(String[] args) {
    

System.out.println("Hello World! - Andre Goncalves, Brazil ");
System.out.println("Hello World! Lucas Gustavo, Brazil ");
System.out.println("Hello World! Gantogtokh Battumur, Mongolia "); 
System.out.println("Hello World! Frank Willian Brazil, Mongolia "); 

System.out.println("This is main program");
GantogtokhMethod();
System.out.println("Please enter a number");
Scanner myKb = new Scanner(System.in);
int num3 = myKb.nextInt();
System.out.println("Please enter another number");
int num4 = myKb.nextInt();
System.out.println("The divide  of " + num3 + " and " + num4 + " is " + (num3 / num4));
   
calculator_sum();    
caclulator_multiplication();


}
}
