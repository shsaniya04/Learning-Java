import java.util.*;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of string: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totlen = 0;

        System.out.println("Enter strings: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totlen += array[i].length();
        }

        System.out.println("Sum of length of all strings: " + totlen);

    }
}