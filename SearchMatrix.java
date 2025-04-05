import java.util.*;

public class SearchMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] num = new int[row][cols];

        System.out.println("Enter values: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("The values are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the value to search: ");
        int x = sc.nextInt();

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (x == num[i][j]) {
                    System.out.println("Element found at: " + i + j);
                }
            }
        }
    }
}