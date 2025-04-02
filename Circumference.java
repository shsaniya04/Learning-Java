import java.util.*;

public class Circumference {
    public static Double circumfrenceOFCircle(Double r){
        Double cir = 2 * 3.14 * r;
        return cir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        Double r = sc.nextDouble();
        System.out.println("Circumference of circle: " + circumfrenceOFCircle(r));
    }
}
