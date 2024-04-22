package com.example.helloworld;

import java.util.Scanner;

public class BankAccount {
    //data members
    private String AccountType;
    private String AccountNumber;
    private double Balance;
    //constructors
    BankAccount()
    {
        AccountType= " ";
        AccountNumber= " ";
        Balance=0.0;
    }//default constructor

    BankAccount(String myAccountType, String myAccountNumber, double myBalance){
        AccountType=myAccountType;
        AccountNumber=myAccountNumber;
        Balance=myBalance;
    }//overloaded constructor
    //set /get
    public void setAccountType(String myAccountType){
        AccountType= myAccountType;
    }// set AccountType
    public void setAccountNumber(String myAccountNumber){
        AccountNumber= myAccountNumber;
    }// set AccountNumber

    public void setBalance(double myBalance){
        Balance=myBalance;
    }//setBalance
    //get
    public String getAccountType(){
        return AccountType;
    }// get AccountType
    public  String getAccountNumber(){
        return AccountNumber;
    }// get AccountNumber
   public double getBalance(){
        return Balance;
    }//getBalance


    public String toString(){
        return "My Account Info is Type: "+AccountType+" , Number : "+AccountNumber+", Balance is" +Balance ;

    }//toString()
    public void deposit(double bal){
        Balance = Balance + bal;

    }
    //withdraw()
    public void withdraw(double gateway) {
        if(gateway <=Balance) {
            Balance = Balance - gateway;
        } else{
            Balance = 0;
        }
    }

}

class Customer{
    private String CustomerName;
    private boolean isEmployee;
    private BankAccount saving;
    private BankAccount checking;
    Customer(String name, boolean isEmp){
        CustomerName = name;
        isEmployee = isEmp;
        saving = null;
        checking = null;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setAccount(String myAccountType, String myAccountNumber, double myBalance) {
        if(myAccountType.equals("saving")){
            saving = new BankAccount(myAccountType, myAccountNumber, myBalance);
        } else{
            checking = new BankAccount(myAccountType, myAccountNumber, myBalance);
        }
    }

    public BankAccount getAccount(String myAccountType){
        if(myAccountType.equals( "saving")){
            return saving;
        }else{
            return checking;
        }
    }

}

class Main{
    //deposit()


    public static void main(String[] args) {
        //my checking
        String[] customerName = {"A","B","C","D","E","F","G","H","I","J"};
        String[] employeeName = {"emp1","emp2","emp3","emp4","emp5"};
        double[] customerSavingBalance = {100,100,100,100,100,100,100,100,100,100,100};
        double[] customerCheckingBalance = {100,100,100,100,100,100,100,100,100,100,100};
        double[] empSavingBalance = {100,100,100,100,100};
        double[] empCheckingBalance = {100,100,100,100,100};
        Customer[] customers = new Customer[10];
        Customer[] employees = new Customer[5];

        for(int i=0; i<10; i++){
            customers[i] = new Customer(customerName[i], false);
            customers[i].setAccount("saving", customers[i] + "_saving", customerSavingBalance[i]);
            customers[i].setAccount("checking", customers[i] + "_checking", customerCheckingBalance[i]);
        }

        for(int i=0; i<5; i++){
            employees[i] = new Customer(customerName[i], true);
            employees[i].setAccount("saving", employeeName[i] + "_saving", empSavingBalance[i]);
            employees[i].setAccount("checking", employeeName[i] + "_checking", empCheckingBalance[i]);
        }

        String cus = "";
        boolean isEmp = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from the emp or customer from the list");
        System.out.println("A,B,C,D,E,F,G,H,I,J,emp1,emp2,emp3,emp4,emp5");
        System.out.println("enter exit to end");
        cus=sc.nextLine();
        while(!cus.equals("exit")){
            Customer cust = null;
            int i = 0;
            String type = "";
            i = getIndex(employeeName, cus);
            if(i>=0){
                cust = employees[i];
            } else{
                i = getIndex(customerName, cus);
                if(i<0){
                    System.out.println("Invalid Input");
                    break;
                }
                 cust = customers[i];
            }
            System.out.println("Choose the account type checking/saving");
            type =  sc.nextLine();
            BankAccount a = cust.getAccount(type);
            System.out.println("1. Deposit, 2. Withdrawal, 3. Balance");
            int option = Integer.parseInt(sc.nextLine());
            if(option == 1){
                System.out.println("Enter Deposit amount");
                a.deposit(Double.parseDouble(sc.nextLine()));
            } else if(option == 2){
                System.out.println("Enter Withdrawal amount");
                a.withdraw(Double.parseDouble(sc.nextLine()));
            }
            System.out.println("Balance "+a.getBalance());
            System.out.println("Select from the emp or customer from the list or enter exit to end");
             cus = sc.nextLine();
        }

        System.out.println("Employee Details are");
        for(int i=0; i<5;i++){
            System.out.println("Name: "+employees[i].getCustomerName() +", Saving : " +employees[i].getAccount("saving").getBalance()+", Checking : " +employees[i].getAccount("checking").getBalance());
        }
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Customer Details are");
        for(int i=0; i<10;i++){
            System.out.println("Name: "+customers[i].getCustomerName() +", Saving : " +customers[i].getAccount("saving").getBalance()+", Checking : " +customers[i].getAccount("checking").getBalance());
        }
    }

    public static int getIndex(String[] cus , String var){
        int i = 0;
        while(i<cus.length){
            if(cus[i].equals(var)){
                return i;
            }
            i++;
        }

        return -1;
    }
}