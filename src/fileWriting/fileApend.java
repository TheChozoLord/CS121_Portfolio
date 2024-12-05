package fileWriting;
import javax.swing.*;
import java.io.*;

public class fileApend {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("wack.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            String name = JOptionPane.showInputDialog("Enter User's user name:");
            String password = JOptionPane.showInputDialog("Enter User's password:");
            String playerCharacter = JOptionPane.showInputDialog("Enter User's player character:");
            int score = Integer.parseInt(JOptionPane.showInputDialog("Enter User's score:"));
            Double winningPercentage = Double.parseDouble(JOptionPane.showInputDialog("Enter User's winning percentage:"));
            output.printf("%-20s %-20s %6d %-23s %-16s", name, password, score, playerCharacter, winningPercentage);
            output.close();
            fileWriter.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
