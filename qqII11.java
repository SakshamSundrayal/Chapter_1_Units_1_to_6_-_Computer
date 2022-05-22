import java.util.*;


class Television {
    // __instance variables
    double cost, discount, amount;
    
    void Accept(double c, double d) {
        cost = c;
        discount = d / 100;
    }
    
    void Calculate() {
        amount = cost - cost * discount;
    }

    void Display() {
        System.out.println("Cost = " + cost);
        System.out.println("Discount = " + (discount * 100) + "%");
        System.out.println("Ammount to be paid = " + amount);
    }
}

public class qqII11 {

    // Unit II
    // Question 11 (Page. 17)

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter cost & discount on Television :");
        double cst = sc.nextDouble();
        double dis = sc.nextDouble();

        Television obj = new Television();

        obj.Accept(cst, dis);
        obj.Calculate();
        obj.Display();
    }    
}