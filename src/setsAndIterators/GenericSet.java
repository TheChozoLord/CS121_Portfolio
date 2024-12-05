package setsAndIterators;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GenericSet {
    static Set<String> mobians = new HashSet<>();

    public static void addItems() {
        Scanner scan = new Scanner(System.in);
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.println("Please input the Name of the Mobian you wish to add or input zero to quit.");
            String input = scan.nextLine();
            if (input.equals("0")) {
                break;
            } else {
                mobians.add(input);
            }
        }
    }
    public static void displayItems() {
        System.out.println(mobians);
    }
}
