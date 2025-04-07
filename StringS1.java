import java.util.*;

public class StringS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = "Saniya";
        String lname = "Shaikh";
        String fullname = fname + " " + lname;
        System.out.println("Length of String:" + fullname.length());
        System.out.println();

        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
