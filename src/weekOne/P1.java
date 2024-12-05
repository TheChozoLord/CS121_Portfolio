package weekOne;
import java.util.Scanner;
import java.util.Random;
public class P1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int char1HP = 0;
        int char2HP = 0;
        int numRounds;
        String char1Name;
        int char1BaseHP;
        String char1MoveName;
        int char1MoveAtk;
        int char1MoveSpeed;
        String char2Name;
        int char2BaseHP;
        String char2MoveName;
        int char2MoveAtk;
        int char2MoveSpeed;
        int tieBreak;
        int char1Wins = 0;
        int char2Wins = 0;


        System.out.println("Please enter the number of rounds you wish to engage in: ");
        numRounds = Integer. parseInt(scan.nextLine());
        System.out.println("Please enter following stats for Player One's Character in the following order: Character Name, Health Points, Attack Name, Attack Power, and Attack Speed");
        char1Name = scan.nextLine();
        char1BaseHP = Integer. parseInt(scan.nextLine());
        char1MoveName = scan.nextLine();
        char1MoveAtk = Integer. parseInt(scan.nextLine());
        char1MoveSpeed = Integer. parseInt(scan.nextLine());
        System.out.println("Please enter following stats for Player Two's Character in the following order: Character Name, Health Points, Attack Name, Attack Power, and Attack Speed");
        char2Name = scan.nextLine();
        char2BaseHP = Integer. parseInt(scan.nextLine());
        char2MoveName = scan.nextLine();
        char2MoveAtk = Integer. parseInt(scan.nextLine());
        char2MoveSpeed = Integer. parseInt(scan.nextLine());
        int w = 0;
        for (int i = 0; i <= numRounds; i++) {
            char1HP = char1BaseHP;
            char2HP = char2BaseHP;
            System.out.println("Battle start!");
            while (w == 0)
            {
                if (char1MoveSpeed > char2MoveSpeed) {
                    char2HP = char2HP - char1MoveAtk;
                    System.out.println(char1Name + " uses " + char1MoveName + " on " + char2Name + " reducing their health to " + char2HP + ".");
                    char1HP = char1HP - char2MoveAtk;
                    System.out.println(char2Name + " uses " + char2MoveName + " on " + char1Name + " reducing their health to " + char1HP + ".");
                }
                else if (char1MoveSpeed < char2MoveSpeed) {
                    char1HP = char1HP - char2MoveAtk;
                    System.out.println(char2Name + " uses " + char2MoveName + " on " + char1Name + " reducing their health to " + char1HP + ".");
                    char2HP = char2HP - char1MoveAtk;
                    System.out.println(char1Name + " uses " + char1MoveName + " on " + char2Name + " reducing their health to " + char2HP + ".");
                }
                else {
                    tieBreak = rand.nextInt(2);
                    if (tieBreak == 0) {
                        char2HP = char2HP - char1MoveAtk;
                        System.out.println(char1Name + " uses " + char1MoveName + " on " + char2Name + " reducing their health to " + char2HP + ".");
                        char1HP = char1HP - char2MoveAtk;
                        System.out.println(char2Name + " uses " + char2MoveName + " on " + char1Name + " reducing their health to " + char1HP + ".");
                    } else if (tieBreak == 1) {
                        char1HP = char1HP - char2MoveAtk;
                        System.out.println(char2Name + " uses " + char2MoveName + " on " + char1Name + " reducing their health to " + char1HP + ".");
                        char2HP = char2HP - char1MoveAtk;
                        System.out.println(char1Name + " uses " + char1MoveName + " on " + char2Name + " reducing their health to " + char2HP + ".");
                    }
                }
                if (char2HP <= 0){
                    System.out.println( char1Name + " wins the match!");
                    char1Wins++;
                    w = 1;
                }
                else if (char1HP <= 0){
                    System.out.println( char2Name + " wins the match!");
                    char2Wins++;
                    w = 1;
                }
            }
            w = 0;
        }
        System.out.print(char1Name + " wins: " + char1Wins + "\n" + char2Name + " wins: " + char2Wins + "\n");
        if (char1Wins > char2Wins){
            System.out.println( char1Name + " wins!");
        }
        else if (char1Wins < char2Wins){
            System.out.println(char2Name + " wins!");
        }
        else if (char1Wins == char2Wins){
            System.out.println("It's a tie!");
        }
    }
}