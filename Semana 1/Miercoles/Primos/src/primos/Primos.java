package primos;

import java.util.Scanner;

public class Primos {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        Funciones funct = new Funciones();
        boolean isPrime = funct.calculatePrimes(number);
        if (isPrime) {
            System.out.println("The number "+number+" is Prime");    
        }
        else {
            System.out.println("The number "+number+" is not Prime");
        }
    }
    
}
