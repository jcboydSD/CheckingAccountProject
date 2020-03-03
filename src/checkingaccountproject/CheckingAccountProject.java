package checkingaccountproject;

/******************************************************************************
 * CheckingAccountProject.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program performs some of the basic functions of a checking account
 *****************************************************************************/

import java.util.Scanner;

public class CheckingAccountProject {

    public static void main(String[] args) {
        //Declarations
        Scanner stdIn = new Scanner(System.in);
        CheckingAccount checking = new CheckingAccount(); //new instance
        String transactionType; //desposit, withdrawal, or quit
        double balance, fee, amount; //input for balance, fee, and transactions 
        //Input
        System.out.println("Checking Account by JC Boyd\n");
        System.out.print("New Checking Account: what is the starting balance? $");
        balance = stdIn.nextDouble();
        stdIn.nextLine(); //clear scanner
        checking.setBalance(balance); //set initial account balance
        System.out.print("What is the fee for this checking account? $");
        fee = stdIn.nextDouble();
        stdIn.nextLine(); //clear scanner
        checking.setFee(fee); //set fee amount for account
        
        do //repeat until user enters q
        {
            System.out.print("\nPlease select deposit (d), withdrawal (w), quit (q): ");
            transactionType = stdIn.nextLine();

            switch (transactionType)
            {
                case "d": case "D":
                    System.out.print("How much will you deposit? $");
                    amount = stdIn.nextDouble(); 
                    stdIn.nextLine(); //clear scanner
                    checking.deposit(amount);
                    checking.printBalance();
                    break;
                case "w": case "W":
                    System.out.print("How much will you withdrawal? $");
                    amount = stdIn.nextDouble();
                    stdIn.nextLine(); //clear scanner
                    checking.withdrawal(amount);
                    checking.printBalance();
            } //end switch

        } while (!transactionType.matches("q|Q")); //end while       
        
    } //end main
    
} //end class CheckingAccountProject
