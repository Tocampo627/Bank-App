
package bankapp;
import java.awt.event.*;
import javax.swing.*;

public class BankAccount {
   
    private String Name;
    private double Balance;

//Methods     
    public BankAccount(String name)
    {
       this.Name=name;
       this.Balance=0; // 0 because there is no bal argumetn in this method
      
    }    
    public BankAccount(String name, double balance)
    {
      this.Name=name;
      this.Balance=balance;
    }
   
    public void Withdraw(double w)// using void because its not a cnstuctor its a method
    {

        // check the balance if there are not enough funds and shows a message using 
        if (w>this.Balance)
        {
           JOptionPane.showMessageDialog(null, "Insufficient Funds");
        }
        else
        {            
            this.Balance-=w; // same as this.Balance=this.Balance-w;
            JOptionPane.showMessageDialog(null, "Your transaction was successful");
        }
        
    }
    public void Deposit(double d)
    {
        if(d>1000)
        {
            JOptionPane.showMessageDialog(null, "Your depoit limit exceeds $1,000. Your transaction was unsuccesful");
        }
        else
        {
            this.Balance+=d;
            JOptionPane.showMessageDialog(null, "Your deposit was successful!!");
        }
    }
    public void SetBalance(double bal)
    {
        this.Balance=bal;
    }
    //methods that return data 
    public String Getname()
    {
        return this.Name;
    }
    public double GetBalance()
    {
        return this.Balance;
    }
}
