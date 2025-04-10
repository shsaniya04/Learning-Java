import java.util.*;

public class ReverseStrForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.next();
        
        String res = "";

        for (int i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed String: " + res);
    }
}
