import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter value: ");
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value for x: ");
        int x = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.print("The element found at index: " + i);
            }
        }
    }
}
