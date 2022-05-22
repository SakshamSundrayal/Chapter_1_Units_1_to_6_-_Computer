import java.util.*;


public class qqV1 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        // Unit V b
        // Question 1

        System.out.println("Enter number of total voters :");
        int t_voter = sc.nextInt();

        // Voters who did go to vote
        double voters = t_voter * 80.0 / 100.0;

        //  Votes for X
        double x = voters * 60.0 / 100.0;
        // Votes for Y
        double y = voters - x;


        System.out.println("Votes For X : " + x);
        System.out.println("Votes For Y : " + y); 
    }
}