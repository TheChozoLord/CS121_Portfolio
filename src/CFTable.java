public class CFTable {
    public static void main(String args[]) {
        double F = 0;
        for(int C = 0; C <= 20; C++){
            F = (9/5.0) * C + 32;
            System.out.println("Degrees Celcius:" + C + " Degrees Farenheit:" + F);
        }
    }
}
