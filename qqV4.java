import java.util.*;


public class qqV4 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        // Unit V b
        // Question 4

        System.out.println("Enter the time in seconds :");
        int secs = sc.nextInt();
        
        // My Method
        int hours = secs / 3600; // Hours
        int rem = secs - hours * 3600;
        int mins = rem / 60; // Minutes
        rem = rem - mins * 60; // Seconds
        
        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + mins);
        System.out.println("Seconds : " + rem);
        
        
        System.out.println("<----------------->");
        
        // Book Method (Prefer to learn this one__)
        
        hours = secs / 3600;
        rem = secs % 3600;
        mins = rem / 60;
        rem = rem % 60;
        
        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + mins);
        System.out.println("Seconds : " + rem);
    }
}