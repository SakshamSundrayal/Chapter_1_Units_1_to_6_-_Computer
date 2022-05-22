import java.util.*;


public class qqV3 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        // Unit V b
        // Question 3

        System.out.println("Enter the salary of the man :");
        double salary = sc.nextDouble();
        
        System.out.println();
        double Food = salary * (1.0 / 2.0);
        double Rent = salary * (1.0 / 15.0);
        double Misc_ = salary * (1.0 / 10.0);
        
        double savings = salary - (Food + Rent + Misc_);
        
        
        System.out.println();
        System.out.println("Money Spent on Food : " + Food);
        System.out.println("Money Spent on Rent : " + Rent);
        System.out.println("Money Spent on Miscellanous activities : " + Misc_);
        System.out.println("Money Saved : " + savings);
    }
}