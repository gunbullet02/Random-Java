import java.util.Scanner;

public class RecursionEx2 {
    public static void main(String[] args) {

        // recursion = the process in which a method calls itself continously
        // a method that calls itself is called a recursive method
        // useful for factorials, transversing trees, and simplifying a complex task

        Scanner scan = new Scanner(System.in);
        System.out.println("How far do you want to walk (meters)? : ");
        int distance = scan.nextInt();
        scan.close();
        takeAStep(0, distance);
    }

    static void takeAStep(int i, int distance) {
        if(i < distance) {
            i++;
            System.out.println("*you take a step*: " + i + "meter/s");
            takeAStep(i, distance);
        }
        else{
            System.out.println("Your are done walking!");
        }
    }
}
