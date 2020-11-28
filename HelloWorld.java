package CA2TimeandTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
    
//Method done by Lucas Gustavo
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
float num3 = myKb.nextFloat();
System.out.println("Please enter another number");
float num4 = myKb.nextFloat();
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
    System.out.println("Please enter your name");
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

//Method done by Maria de Oliveira

public class Main {
    
    Public static void main (String[] args) {
        Book Book = new Book();
        
        Book.name = "Don’t Overthink It";
        Book.description = "Make Easier Decisions, Stop Second-Guessing, and Bring More Joy to Your Life";
        Book.isbn = "9780801094460";
        Book.price ="$11,25";
        Book.author = "Anne Bogel";
        Book.date = "03/03/2020";
        
        Void BookData() {
            System.out.printIn("Book name: " + name);
            System.out.printIn("Price: " + price);
            System.out.printIn("Author: " + author);
            System.out.printIn("Release Date: " + date +"/n");

}
