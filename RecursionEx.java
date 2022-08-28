import java.util.Scanner;

public class RecursionEx {
    public static void main(String[] args){

        // Recursion = the process in which a method calls itself continuously
        // a method that calls itself is called recursive

        Scanner scan = new Scanner(System.in);
        System.out.println("Say hello how many times?: ");
        int number = scan.nextInt();
        scan.close();
        HelloWorld(number);
    }

    static void HelloWorld(int i){
        if(i > 0) {
            System.out.println("Hello World! " + i);
            i--;
            HelloWorld(i);
        }
    }
}
