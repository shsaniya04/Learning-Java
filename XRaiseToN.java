import java.util.*;

public class XRaiseToN {
    public static int xRaiseToN(int x, int n){
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power = power * x;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x + " raise to "+ n + ": " + xRaiseToN(x, n));
    }
}
