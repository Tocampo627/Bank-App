
package bankapp;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;

public class Bankapp {

  
    public static void main(String[] args) {        
        Scanner s=new Scanner(System.in);
        String name;
        double balance;
        double withdraw;
        double deposit;
              
    // TEST 1
        System.out.println("\n\nBank System App - ONLINE");
        System.out.println("================");
        // Popup for name Enter
        name=JOptionPane.showInputDialog("Enter Name of The Account Owner");
        BankAccount b1=new BankAccount(name);
        
        //test the cosntructor 
        System.out.println("Accout Owner ==> "+b1.Getname());
        System.out.println("Balance ==> "+b1.GetBalance());
        
        // test setting balance
        balance=Double.parseDouble(JOptionPane.showInputDialog("enter your balance"));        
        b1.SetBalance(balance);
        System.out.println("Balance after initial deposit ==> "+ b1.GetBalance());
        
        //Test Withdraw 
        System.out.print("Withdraw- How much do you want to withdraw ==> ");
        withdraw=s.nextDouble();
        b1.Withdraw(withdraw);
        System.out.println("Balance after withdraw ==>" + b1.GetBalance());
        
        //Test Deposit 
        System.out.print("Deposit- How much do you want to deposit ==> ");
        deposit=s.nextDouble();
        b1.Deposit(deposit);
        System.out.println("Balance after depost ==>" + b1.GetBalance());
    
        // clearing "flushing" inputs
        s.nextLine(); // forces to empty the input stream from previous scanner
    // TEST 2
 
        // scanning the entered balance 
        System.out.println("\n\nBank System App- Branch Office");
        System.out.println("================");
        System.out.print("Enter name of account owner ==> "); 
        name=s.nextLine();
        System.out.print("Enter your balance ==> ");
        balance=s.nextDouble();
                
        BankAccount b2=new BankAccount(name, balance);
        //test the cosntructor 
        System.out.println("Accout Owner ==> "+b2.Getname());
        System.out.println("Balance ==> "+b2.GetBalance());
                
        //Test Withdraw 
        System.out.print("Withdraw- How much do you want to withdraw ==> ");
        withdraw=s.nextDouble();
        b2.Withdraw(withdraw);
        System.out.println("Balance after withdraw ==>" + b2.GetBalance());
        
        //Test Deposit 
        System.out.print("Deposit- How much do you want to deposit ==> ");
        deposit=s.nextDouble();
        b2.Deposit(deposit);
        System.out.println("Balance after depost ==>" + b2.GetBalance());
    
    }
    
}

