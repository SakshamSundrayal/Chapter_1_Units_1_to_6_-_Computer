import java.util.*;


public class qqV2 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        // Unit V b
        // Question 2

        System.out.println("Enter printed price of mobile phone :");
        double p = sc.nextDouble();

        double discount = p * 10.0 / 100.0;
        double r_amt = p - discount;

        double GST = r_amt * 9.0 / 100.0;
        double amt = r_amt + GST;

        System.out.println("Final Pay Amount = " + amt);
    }
}