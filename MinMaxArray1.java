import java.util.*;

public class MinMaxArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter value: ");
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        
        for(int num : arr){
            if (num < min) {
                min  = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
