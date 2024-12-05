package setsAndIterators;

import java.util.Scanner;
import java.util.Set;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuSelect = 0;
        GenericSet list = new GenericSet();
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("1) Add an Item\n2) Display all items\n3) Exit");
            menuSelect = Integer.parseInt(scan.nextLine());
            switch (menuSelect) {
                case 1:
                    list.addItems();
                    break;
                case 2:
                    list.displayItems();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

}
