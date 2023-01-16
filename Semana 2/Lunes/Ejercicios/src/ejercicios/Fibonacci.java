
package ejercicios;

public class Fibonacci {

    public Fibonacci() {
    }
    
    public void calculateFibo(int maxNumber) {
        int number1 = 0;
        int number2 = 1;
        System.out.println("The Fibonacci serie is:");
        while (number1 < maxNumber){
            int aux = number1;
            System.out.print(number1+" ");
            number1 = number2;
            number2 += aux;
        }
    }
    
}
