package Assignment2;

class BankAccount{
    int balance =  1000;

    public synchronized void withdraw(String name , int amount){
        if(balance>=amount){
            System.out.println(name + " is trying to withdraw");
            try{
                Thread.sleep(100);
            }catch(Exception e){

            }
            balance-=amount;
            System.out.println(name+"completed withdrawl. Balance.:"+ balance);
        }else{
            System.out.println(name + "cannot withdraw. Balance:"+ balance);
        }
    }
}

class Person extends Thread{
    BankAccount account;
    String personName;

    Person(BankAccount acc, String name){
        this.account = acc;
        this.personName =  name ;
    }

    public void run(){
        account.withdraw(personName, 700);
    }
}

public class Main {
    public static void main(String[]args){
        BankAccount account = new BankAccount();

        Person alice = new Person(account,"Alice");
        Person bob = new Person(account,"Bob");

        System.out.println("Initial Balance:" + account.balance);

        alice.start();
        bob.start();
    }
}
