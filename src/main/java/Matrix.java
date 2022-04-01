import java.util.ArrayList;
//1.feladat
public class Matrix {


    public static int sumOfEvenNumbers(int[][] tomb){
        int x = 0;

        for(int i = 0; tomb.length>i; i++){

            for(int j = 0; tomb[i].length>j; j++) {

                if(tomb[i][j]%2==0 ) {
                    x= x+tomb[i][j];
                }

            }
        }
        return x;
    }

    public static ArrayList<Integer> rowsWithZero(int[][] tomb){




        ArrayList<Integer> x = new ArrayList<>();

        for(int i = 0; tomb.length>i; i++){




            for(int j = 0; tomb[i].length>j; j++) {

                if(tomb[i][j]==0) {
                    x.add(i);

                }

            }
        }
        return x;
    }
}