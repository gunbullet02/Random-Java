import java.util.Scanner;

public class ATM {
    public static void main(String args[])
    {
        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Atm Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the operation you want to perform:");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your transaction");
                }
                else
                {
                    System.out.println("Insuffience Balance");
                }
                System.out.println("");
                break;

                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your money has been successfully deposited");
                System.out.println("");
                break;

                case 3:
                System.out.println("Balance : " + balance);
                System.out.println("");
                break;

                case 4:
                System.exit(0);
                sc.close();
            }
        }
    }
}
