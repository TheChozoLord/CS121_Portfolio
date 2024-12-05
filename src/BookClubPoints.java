import java.util.Scanner;

public class BookClubPoints {
    public static void main(String args[]) {
        int booksPurchased;
        int points;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of books you purchased today: ");

        booksPurchased = Integer.parseInt(scan.nextLine());

        if (booksPurchased == 0) {
            points = 0;
        }
        else if (booksPurchased == 1) {
            points = 5;
        }

        else if (booksPurchased == 2) {
            points = 15;
        }

        else if (booksPurchased ==3){
            points = 30;
        }

        else if (booksPurchased >= 4){
            points = 60;
        }
        else {
            points = -1;
            System.out.println("Invalid input.");
        }
        System.out.println("You earned " + points + " points today.");

        scan.close();
    }
}