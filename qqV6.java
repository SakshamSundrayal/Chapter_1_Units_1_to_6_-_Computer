public class qqV6
{
    public static void main() {
        
        // Unit V B
        // Question 6
        
        int a = 5;
        int b = 3;
        
        System.out.println("Numbers before swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
        // Swapping...
        a = a + b; // stored sum of a and b in 'a'
        b = a - b; // took value of old 'a' by subtracting 'b' from the 'sum of a and b'
        // as 'b' now have the value of old 'a' so subtracting 'old a value' from 'sum of a and b'
        // will give 'old value of b'
        a = a - b;
        
        System.out.println("Number after swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
    }
}