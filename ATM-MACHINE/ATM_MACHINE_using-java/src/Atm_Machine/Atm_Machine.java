package Atm_Machine;


import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 7800;


    // This particular code take input from users and checks it pin wrong or right...
    public void CheckPin(){
        System.out.println("Enter your 4 digit PIN:- ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        }else{
            System.out.println("Inavlid PIN, Plesase Try Again !");
        }
    }

    // This particular code show menu for ATM Machine...

    public void menu(){
        System.out.println("Enter your choice:- ");
        System.out.println("1. Check A/C Balance... ");
        System.out.println("2. Withdraw Money... ");
        System.out.println("3. Deposit Money... ");
        System.out.println("4. Exit... ");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        }else if(opt == 2){
            withdrawMoney();
        } else if (opt == 3) {
            depositeMoney();
        } else if (opt == 4) {
            return;
        }else{
            System.out.println("Please take a valid Choice! ");
        }

    }

    // Creating functions for checkBalance...
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    // Creating functions for withdrawMoney...
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw:- ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > Balance) {
            System.out.println("Insufficient Balance! ");
        }else{
            Balance = Balance - amount;
            System.out.println("Money withdrawn. SuccessFully! ");
        }
        menu();
    }
    // Creating function for depositMoney...
    public void depositeMoney(){
        System.out.println("Enter the Amount:- ");
        Scanner sc = new Scanner(System.in);
        float amount_1 = sc.nextFloat();
        Balance = Balance + amount_1;
        System.out.println("Money Deposited. SuccessFully! ");
        menu();
    }

}
public class Atm_Machine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.CheckPin();
    }
}
