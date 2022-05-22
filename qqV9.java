import java.util.*;

public class qqV9 {
    public static void main() {
        
        Scanner sc = new Scanner(System.in);
        
        // Unit V
        // Question 9
        
        
        System.out.println("Enter Cost Price : ");
        double cp = sc.nextDouble();
        
        double sp = ((100.0 + 25.0) / 100.0) * cp;
        double mp = (100.0 / (100.0 - 25)) * sp;
        
        System.out.println("Selling Price : " + sp);
        System.out.println("Marked Price : " + mp);
        
    }
}