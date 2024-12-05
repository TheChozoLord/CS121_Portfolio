package fileWriting;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) throws FileNotFoundException{
        File fileOutput = new File("wack.txt");
        try {
            Scanner console = new Scanner(fileOutput);
            String header = console.nextLine();
            System.out.printf("%s",header);
            while(console.hasNextLine()){
                String name = console.next();
                String password = console.next();
                int score = Integer.parseInt(console.next());
                String playerCharacter = console.next();
                double winningPercentage = Double.parseDouble(console.next());
                System.out.printf("%-20s %-20s %6d %-23s %-16s", name, password, score, playerCharacter, winningPercentage);
            }
            console.close();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

