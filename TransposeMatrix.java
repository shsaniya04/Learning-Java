import java.util.*;

public class TransposeMatrix {
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

        System.out.println("The Matrix A is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix A is: ");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < row; i++) {
                System.out.println(num[j][i] + " ");
            }
        }
    }
}