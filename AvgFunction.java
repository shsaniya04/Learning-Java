import java.util.*;

public class AvgFunction {
    public static float averageOf3(int a, int b,int c){
        return (a + b + c)/3;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of 3 integers is: " + averageOf3(a, b, c));
    }
}
