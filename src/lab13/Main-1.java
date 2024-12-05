/*package lab13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    static LBSearch lb  = new LBSearch();
    public static void main(String[] args) {
        int [] array = {23,17,12,90,84,38,5,77,44};
        System.out.println("Unsorted:");
        for(int num: array){
            System.out.println(">>\t" + num);
        }
        System.out.println();
        //Searching with Linear
        linearSearchPrint(array);
        //Searching with Binary
        binarySearchPrint(array);
    }
    //Linear Search Method
    public static void linearSearchPrint(int [] array){

        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());
        int found = lb.LinearSearchMethod(key, array);
        if(found == -1){
            System.out.println("Item is not found.");
        }else{
            System.out.printf("Item found at index %d, postiion %d", found, found+1);
        }
    }
    public static void binarySearchPrint(int [] array){
        //Sorted Array
        Arrays.sort(array);
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());
        int found = lb.BinarySearchMethod(key, array);
        if(found == -1){
            System.out.println("Item is not found.");
        }else{
            System.out.printf("Item found at index %d, postiion %d", found, found+1);
        }
    }
}
*/