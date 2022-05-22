import java.util.*;

public class qqV7
{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        // Unit V B
        // Question 7
        
        System.out.println("Enter Principal :");
        double p = sc.nextDouble();
        
        double amt = p * (1.0 + 6.0 / 100.0) * (1.0 + 8.0 / 100.0) * (1.0 + 10.0 / 100.0);
        double cp = p + amt;
        
        System.out.println("Amount : " + amt);
        System.out.println("Compound Interest : " + cp);
        
    }
}
