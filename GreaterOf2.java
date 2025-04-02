import java.util.*;

public class GreaterOf2 {
    public static void greaterOf2(int a, int b){
        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterOf2(a, b);
    }
}
