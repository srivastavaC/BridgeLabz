//write a code to calculate simple interest
import java.util.Scanner;
public class SimpleInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();
        
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest for principal " + principal + ", rate " + rate + "%, and time " + time + " years is: " + simpleInterest);
        
        scanner.close();
    }
}