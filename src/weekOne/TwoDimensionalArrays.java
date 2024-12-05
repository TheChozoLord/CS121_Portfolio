package weekOne;
public class TwoDimensionalArrays {
    public static void main(String args[]) {
        int [][] score = { {11, 85, 94}, {76, 96, 76}, {94, 61, 73}, {93, 41, 97} };
        double [][] key = new double[4][3];
        String [][] names = {{"Sally", "Nicole", "Amy"},{"Antoine", "Tommy", "Miles"}};

        for (int i = 0; i < score.length; i++) {
            for(int j=0; j< score[i].length; j++){
                System.out.printf(" %d", score[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(double[] row: key){
            for(double column: row){
                System.out.printf("%.2f ", column);
            }
            System.out.println();
        }
        System.out.println();

        for(String[] row: names){
            for(String column: row){
                System.out.printf("%s ", column);
            }
            System.out.println();
        }
        System.out.println();

    }
}
