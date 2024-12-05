import java.util.Scanner;
public class TestScore {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double testScoreOne;
        double testScoreTwo;
        double testScoreThree;
        double finalScore;
        int numOfStudents;
        Double classTotal = 0.0;
        Double classAverage;
        String name;
        System.out.println("Please input the number of students in the class:");
        numOfStudents = Integer.parseInt(scan.nextLine());
        for (int i =0; i < numOfStudents; i++) {
            System.out.println("Please enter the Student's name:");
            name = scan.nextLine();
            System.out.println("Please input " + name + "'s last three test scores:");
            testScoreOne = Double.parseDouble(scan.nextLine());
            testScoreTwo = Double.parseDouble(scan.nextLine());
            testScoreThree = Double.parseDouble(scan.nextLine());

            finalScore = (testScoreOne + testScoreTwo + testScoreThree) / 3;
            classTotal = classTotal + finalScore;
            if (finalScore >= 90) {
                System.out.println(name + "'s getting an A.");
            } else if (finalScore >= 80) {
                System.out.println(name + "'s getting a B.");
            } else if (finalScore >= 70) {
                System.out.println(name + "'s getting a C.");
            } else if (finalScore >= 60) {
                System.out.println(name + "'s getting a D.");
            } else if (finalScore < 60) {
                System.out.println(name + "'s getting an F.");
            }
        }
        classAverage = classTotal/numOfStudents;
        if (classAverage >= 90) {
            System.out.println("The class average is A or " + classAverage);
        } else if (classAverage >= 80) {
            System.out.println("The class average is B or " + classAverage);
        } else if (classAverage >= 70) {
            System.out.println("The class average is C or " + classAverage);
        } else if (classAverage >= 60) {
            System.out.println("The class average is D or " + classAverage);
        } else if (classAverage < 60) {
            System.out.println("The class average is F or " + classAverage);
        }
    }
}