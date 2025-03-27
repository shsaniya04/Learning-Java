import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            if (n == 1) {
                System.out.println("This is neither Prime nor composite!");
            } else {
                System.out.println("This is Prime Number");
            }
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
