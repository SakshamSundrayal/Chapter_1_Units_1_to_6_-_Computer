import java.util.*;

public class qqV8 {
    public static void main() {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter x-cordinates :");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        
        System.out.println("Enter y-cordinates : ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        
        double slope = (y2 - y1) / (x2 - x1);
        System.out.println("Slope : " + slope);
    }
}