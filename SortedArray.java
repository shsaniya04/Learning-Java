import java.util.*;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter value: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        boolean isAscending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Sorted array");
        } else {
            System.out.println("Not Sorted array");
        }
    }
}
