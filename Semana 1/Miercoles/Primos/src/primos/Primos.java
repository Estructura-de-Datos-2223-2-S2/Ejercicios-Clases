package primos;

import java.util.Scanner;

public class Primos {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        Funciones funct = new Funciones();
        boolean isPrime = calculatePrimes(number);
        if (isPrime) {
            System.out.println("The number "+number+" is Prime");    
        }
        else {
            System.out.println("The number "+number+" is not Prime");
        }
    }
    
    public static boolean calculatePrimes(int number) {
        int aux = number -1;
        while (aux > 1) {
            if (number % aux == 0) {
                return false;
            }
            aux--;
        }
        return true;
    }
    
}
