import java.util.*;

public class TwoDArray {
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
    }
}