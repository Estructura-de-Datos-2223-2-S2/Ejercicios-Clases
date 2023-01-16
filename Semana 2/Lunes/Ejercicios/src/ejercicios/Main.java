package ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** Welcome ***");
        System.out.println("Please enter a valid option: ");
        System.out.println("1- Fibonacci");
        System.out.println("2- Counter arrays values");
        System.out.println("3- String to Array");
        
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        Arrays arrays = new Arrays();
        if (option == 1) {
            // 0 1 1 2 3 5 8 13 21 ...
            System.out.println("Please enter the max number");
            int maxNumber = sc.nextInt();
            Fibonacci fibo = new Fibonacci();
            fibo.calculateFibo(maxNumber);
        } else if (option == 2) {
            arrays.valueCounter();
        } else if (option == 3) {
            System.out.println("Please enter a number");
            String word = sc.next();
            arrays.stringToArray(word);
        }
        
    
    
   
        
    }
    
}
