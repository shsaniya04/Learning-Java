import java.util.*;

public class FibonacciFunction {
    public static void fibonacciSeries(int n){
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            for (int i = 2; i <= n ; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = b + a;
                a = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        fibonacciSeries(n);
    }
}