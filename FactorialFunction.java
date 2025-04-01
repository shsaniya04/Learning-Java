
import java.util.Scanner;


public class FactorialFunction {
    public static int Factorial(int n){
        if (n < 0) {
            System.out.println("Invalid Number!");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Faxtorial of "+ n+ " is: " + Factorial(n) );

    }
}
