package weekOne;
import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String args[]) {
        String[] name = new String[3];
        String[] species = new String[3];
        int[] numLimbs = new int[3];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Name: ");
            name[i] = console.nextLine();
            System.out.print("Species: ");
            species[i] = console.nextLine();
            System.out.print("Number of limbs: ");
            numLimbs[i] = Integer.parseInt(console.nextLine());
        }


        System.out.printf("%-14s %10s %14s\n", "Name", "Species", "Number of Limbs");
        for (int i = 0; i < 3; i++){
            System.out.printf("%-14s %10s %14d\n", name[i], species[i], numLimbs[i]);
        }
    }
}
