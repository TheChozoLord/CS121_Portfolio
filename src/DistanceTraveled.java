import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double distance;
        double time;
        double  fast;

        System.out.println("Please enter your speed in miles per hour:");
        fast = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter your time spent traveling in hours:");
        time = Double.parseDouble(scan.nextLine());

        for(int i = 0; i <= time; i++){
            distance = fast * i;
            System.out.println("Hour:" + i + " Distance Traveled:" + distance);
        }


    }
}
