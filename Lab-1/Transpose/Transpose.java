import java.util.*;

public class Transpose {

    public static void main(String args[]) {
        int row, col;

        System.out.println("Enter The Number Of Column : ");
        Scanner sc = new Scanner(System.in);

        col = sc.nextInt();

        System.out.println("Enter The Number Of Rows : ");
        row = sc.nextInt();

        System.out.println("Enter The Matrix : ");

        int matrix[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                matrix[i][j] = sc.nextInt();

            }
            System.out.println();
        }

        System.out.println("The Matrix Is : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Transpose Of The Matrix Is : ");

        int matrixt[][] = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {

                matrixt[i][j] = matrix[j][i];
                System.out.print(matrixt[i][j] + " ");

            }
            System.out.println();
        }

    }

}
