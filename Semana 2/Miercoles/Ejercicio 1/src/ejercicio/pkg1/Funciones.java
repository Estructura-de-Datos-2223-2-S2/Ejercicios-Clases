package ejercicio.pkg1;


public class Funciones {
    
    public int searchMaxInVector(int[] vector) {
        int max = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        return max;
    }
    
    public int[][] sumMatrix(int[][] matrix1, int[][]matrix2) {
        int[][] matrixResult = new int[4][4];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }
    
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" "+ matrix[i][j]+" ");
            }
            System.out.println("");
        } 
    }
}
