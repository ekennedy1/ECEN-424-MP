
import java.io.*;
import java.util.*;  

public class Main {
    public static void main(String[] args) {
        Calculator mycalc = new Calculator();
        boolean stop = true;
        do {
            mycalc.setname("Group 12");
            System.out.println("Welcome to the Calculator designed by " + mycalc.getname() + ".");
            System.out.println("Enter A to Add, S to Subtract, M to Multiply, and Q to quit.");
            Scanner sc= new Scanner(System.in); 
            String str = sc.nextLine();      
            switch(str){
                case "A":
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter argument 1:");  
                    String num1 = sc1.nextLine();
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter argument 2:");
                    String num2 = sc2.nextLine();
                    float f1 = 0;
                    float f2 = 0;
                    try {
                        f1 = Float.parseFloat(num1); 
                        f2 = Float.parseFloat(num2);
                    } catch (NumberFormatException e) {
                        break;
                    }
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + mycalc.addition(f1,f2));
                    break;
                case "S":
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter argument 1:");  
                    String num3 = sc3.nextLine();
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Enter argument 2:");
                    String num4 = sc4.nextLine();
                    float f3 = 0;
                    float f4 = 0;
                    try {
                        f3 = Float.parseFloat(num3); 
                        f4 = Float.parseFloat(num4);
                    } catch (NumberFormatException e) {
                        break;
                    }
                    System.out.println("The sum of " + num3 + " and " + num4 + " is " + mycalc.subtraction(f3,f4));
                    break;
                case "M":
                    Scanner sc5 = new Scanner(System.in);
                    System.out.println("Enter argument 1:");  
                    String num5 = sc5.nextLine();
                    Scanner sc6 = new Scanner(System.in);
                    System.out.println("Enter argument 2:");
                    String num6 = sc6.nextLine();
                    float f5 = 0;
                    float f6 = 0;
                    try {
                        f5 = Float.parseFloat(num5); 
                        f6 = Float.parseFloat(num6);
                    } catch (NumberFormatException e) {
                        break;
                    }
                    System.out.println("The sum of " + num5 + " and " + num6 + " is " + mycalc.multiplication(f5,f6));
                    break;
                case "Q":
                    stop = false;
                default:
                    break;
            }
        }
        while(stop);
    }    
}

