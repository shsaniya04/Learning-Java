import java.util.*;

public class SumOfNno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index;
        }
        System.out.println(sum);
    }
}
