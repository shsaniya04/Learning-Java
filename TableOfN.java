import java.util.*;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple = sc.nextInt();
        System.out.println("Table of " + multiple + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(multiple * i);
        }
    }
}