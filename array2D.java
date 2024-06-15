import java.util.*;
public class array2D {
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key) {
                    System.out.println("Key found at "+ "("+i+","+j+")" +"in the matrix");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void printSpiral(int spiral[][]){
        int Startrow = 0;
        int Startcol = 0;
        int endRow = spiral.length -1;
        int endCol = spiral[0].length -1;
        while (Startrow <= endRow && Startcol <= endCol) {
            //top
            for(int j=Startcol; j<=endCol;j++){
                System.out.print(spiral[Startrow][j] + " ");
            }

            //right
            for (int i = Startrow+1; i <= endRow; i++) {
                System.out.print(spiral[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol-1; j>= Startcol;j--){
                if (Startrow==endRow) {
                    break;
                }
                System.out.print(spiral[endRow][j] + " ");
            }

            //left
            for (int i = endRow-1; i>=Startrow+1; i--) {
                if (Startcol==endCol) {
                    break;
                }
                System.out.print(spiral[i][Startcol] + " ");
            }

            Startrow++;
            Startcol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static int diagonalSum(int spiral[][]){ //O(n^2)
        int sum = 0;
        //for primary diagonal : i==j
        //for secondary diagonal : i+j = n-1
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[0].length; j++) {
                if (i==j) {
                    sum += spiral[i][j];
                }
                else if (i+j == spiral.length-1) {
                    sum += spiral[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum2(int spiral[][]){
        int sum = 0;
        for (int i = 0; i < spiral.length; i++) {
            sum += spiral[i][i];
            if (i!= spiral.length-1-i) {
                sum += spiral[i][spiral.length-1-i];
            }
        }
        return sum;
    }

    public static boolean staircaseSearchInSpiral(int spiral[][],int key){
        //search is possible only in sorted matrix.
        //O(n+m)
        int row = 0, col = spiral[0].length-1;
        while (row<spiral.length && col>=0) {
            if (spiral[row][col] == key) {
                System.out.printf("Key found at %d row and %d column", row,col);
                return true;
            }
            else if (spiral[row][col]>key) {
                col--; //move towards left(smaller)
            }
            else{
                row++; //move downwards(larger)
            }
        } 
        System.out.println("Key not found");
        return false;
    }
    
    public static void main(String[] args) {
        //Diagonal sum
        //spiral matrix 
        int spiral[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 90;
        staircaseSearchInSpiral(spiral, key);
        // printSpiral(spiral);
        // diagonalSum(spiral);
        // diagonalSum2(spiral);


        int matrix[][] = new int[4][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println("Element searching");
        // search(matrix, 6);
        sc.close();
    }
}
