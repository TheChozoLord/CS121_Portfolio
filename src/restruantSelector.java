import java.util.Scanner;
public class restruantSelector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boolean veggie;
        Boolean veag;
        Boolean gluten;
        String response;

        System.out.println("Please only response Y or N");
        System.out.println("Is anyone in your group a Vegitarian?");
        response = scan.nextLine();
        if(response.equals("Y")){
            veggie = true;}
        else{
            veggie = false;}
        System.out.println("Is anyone in your group a Vegan?");
        response = scan.nextLine();
        if(response.equals("Y")){
            veag = true;}
        else{
            veag = false;}
        System.out.println("Is anyone in your group alergic to gluten?");
        response = scan.nextLine();
        if(response.equals("Y")){
            gluten = true;}
        else{
            gluten = false;}

        if(veggie.equals(false) && veag.equals(false) && gluten.equals(false)) {
            System.out.println("You can go anywhere.");
        }
        else if(veggie.equals(true) && veag.equals(false) && gluten.equals(false)) {
            System.out.println("You can go to: Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, and The Chef's Kitchen.");
        }
        else if(veggie.equals(false) && veag.equals(true) && gluten.equals(false)) {
            System.out.println("You can go to: Corner Cafe, or The Chef's Kitchen.");
        }
        else if(veggie.equals(false) && veag.equals(false) && gluten.equals(true)) {
            System.out.println("You can go to: Main Street Pizza Company, Corner Cafe, or The Chef's Kitchen.");
        }
        else if(veggie.equals(true) && veag.equals(true) && gluten.equals(false)) {
            System.out.println("You can go to: Corner Cafe or The Chef's Kitchen.");
        }
        else if(veggie.equals(true) && veag.equals(false) && gluten.equals(true)) {
            System.out.println("You can go to: Main Street Pizza Company, Corner Cafe, or The Chef's Kitchen.");
        }
        else if(veggie.equals(false) && veag.equals(true) && gluten.equals(true)) {
            System.out.println("You can go to: Corner Cafe or The Chef's Kitchen.");
        }
        else if(veggie.equals(true) && veag.equals(true) && gluten.equals(true)) {
            System.out.println("You can go to: Corner Cafe or The Chef's Kitchen.");
        }
    }
}
