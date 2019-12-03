import java.util.Scanner;

public class PenjumlahanMatriksTanpaInputan {
    public static void main(String[] args) {
        int A[][] = new int[2][2];
        int B[][]= new int[2][2];


        A[0][0] = 2;
        A[0][1] = 2;
        A[1][0] = 2;
        A[1][1] = 2;


        B[0][0] = 2;
        B[0][1] = 2;
        B[1][0] = 2;
        B[1][1] = 2;


        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                int hasil = A[i][j] + B[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println(" ");
        }

    }
}