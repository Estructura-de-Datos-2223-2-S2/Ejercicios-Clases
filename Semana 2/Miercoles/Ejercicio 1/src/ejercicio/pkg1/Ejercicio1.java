package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("*** WELCOME ***");
        System.out.println("Please enter a valid option: \n1-Vectors\n2Matrix\n->");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Funciones func = new Funciones();
        if (option == 1) {
            int[] vector = {1,2,3,4,5,6,7,8,9,10}; // Manera de llenar 1
            for (int i = 0; i < vector.length; i++) {// Manera de llenar 2
                vector[i] =i;
            } 
            int result = func.searchMaxInVector(vector);
            System.out.println("Result: "+result);
        } else if (option == 2) {
            int[][] mat1 = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
            int[][] mat2 = new int[4][4];
            for (int i = 0; i < mat2.length; i++) {
                for (int j = 0; j < mat2.length; j++) {
                    mat2[i][j] = i+j; //{{0,1,2,3},{1,2,3,4},{2,3,4,5},{3,4,5,6}}
                } 
            } 
            System.out.println("Matriz 1");
            func.printMatrix(mat1);
            System.out.println("Matriz 2");
            func.printMatrix(mat2);
            int[][] result = func.sumMatrix(mat1,mat2);
            System.out.println("Matriz Resultado");
            func.printMatrix(result);
        }
    }
    
}
