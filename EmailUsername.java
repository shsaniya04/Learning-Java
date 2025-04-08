import java.util.*;

public class EmailUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gmail: ");
        String str = sc.next();
        String res = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            }
            else{
                res += str.charAt(i);
            }
        }
        System.out.println("Your username is: " + res);

    }
}