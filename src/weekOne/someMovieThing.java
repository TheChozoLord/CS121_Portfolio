package weekOne;
import java.util.Scanner;
import java.util.Random;

public class someMovieThing {
static int index;
static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        int seats [][] = new int [10][10];
        String[] movieNames = {"Jumanji", "Matrix", "Star Wars","Oppenheimer"};
        String[] movieTypes = {"2D", "3D", "2D","Drama/Historical"};
        double[] moviePrices = {15.25, 20.15, 18.11,22.12};

        /*for(int i = 0; i<NUM_OF_MOVIES; i++){
            System.out.println("Please enter your movie details." + (i + 1));
            System.out.println("Name");
            movies[i] = scanner.nextLine();
            System.out.println("Type");
            type[i] = scanner.nextLine();
            System.out.println("Availability");
            time[i] = Double.parseDouble(scanner.nextLine());
            System.out.println("Price");
            price[i] = Double.parseDouble(scanner.nextLine());
        }*/

        //intitializeSeats(seats);
        /*selectMovie();
        displaySelectedMovie(movieNames, movieTypes, moviePrices);
        randomizeAvailability();
        displaySeatAvailability();

         */
    }
/*
    static int selectMovie(String movieNames[]){
        boolean inSystem = false;
        while (!inSystem){
            System.out.println("Please input the movie you want to see: ");
            String desire = (scanner.nextLine()).lowercase;
            for(int i = 0; i < (movieNames.length); i++){
                if(desire.equals(movieNames[i])){
                    //(Return the value of the movie the user wants to see to main);
                    index = i;
                    inSystem = true;
                    break;
                }
            }
            System.out.println("Movie not found. Please enter another movie.");


        }


    }

    public static void intitializeSeats(int [][] seats){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 0; // 0 indicates available
            }
        }
    }

    public static void randomizeAvailability(int [][] randomSeats){
        Random random = new Random();
        for (int i = 0; i < randomSeats.length; i++) {
            for (int j = 0; j < randomSeats[i].length; j++) {
                randomSeats[i][j] = random.nextInt(2);
            }
        }
    }

    static void displaySelectedMovie(String movies[], String type[], double price[]){
        System.out.println("\nMovie Details: ");
        String header = String.format("%-20s %-20s %-20s %-20s", "Movie Name", "Movie Type", "Showing Times", "Price");
        System.out.println(header);
        for(int i = 0; i<movies.length; i++) {
            String output = String.format("%-20s %-20s %-20f %-20f", movies[i], type[i], price[i]);
            System.out.println(output);
        }
    }

         */
}