import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        String city;
        String college;
        String major;
        String animalType;
        String petName;

        System.out.println("Enter your name.");
        name = scan.nextLine();
        System.out.println("Enter your age as a number.");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("Enter a city name.");
        city = scan.nextLine();
        System.out.println("Enter the name of a college.");
        college = scan.nextLine();
        System.out.println("Enter your major.");
        major = scan.nextLine();
        System.out.println("Enter a type of Animal.");
        animalType = scan.nextLine();
        System.out.println("Type in the name of a pet.");
        petName = scan.nextLine();

        System.out.printf("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ".\n" + name + " graduated with a major in " + major + ". Then, " + name + " adopted a(n) " + animalType + " named " + petName + ". They both lived happily ever after!");
    }
    }
