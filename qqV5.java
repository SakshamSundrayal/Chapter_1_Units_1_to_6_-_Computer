public class qqV5
{
    public static void main() {
        
        // Unit V B
        // Question 5
        
        int distance = 240;
        int speed1 = 60;
        int speed2 = speed1 - 20;
        
        // time = time1 + time2
        // time = (dist. / s1) + (dist. / s2)
        double time = (distance / speed1) + (distance / speed2);
        
        double avgSpeed = distance / time;
        
        System.out.println("Time taken = " + time);
        System.out.println("Average Speed = " + avgSpeed);
    }
}
