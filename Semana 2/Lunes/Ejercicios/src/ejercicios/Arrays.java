package ejercicios;

import java.util.Scanner;

public class Arrays {

    public Arrays() {
    }
    
    public void valueCounter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int size = sc.nextInt();
        int[] array = new int[size];
        int contPositive = 0;
        int contNegative = 0;
        int contZeros = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the value number "+(i+1)+":");
            int number = sc.nextInt();
            array[i] = number;
        }
        sc.close();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == 0){
                contZeros++;
            } else if (array[i] > 0) {
                contPositive++;
            } else {
                contNegative++;
            }
        }
        System.out.println("We have "+contZeros+" 0");
        System.out.println("We have "+contPositive+" positives");
        System.out.println("We have "+contNegative+" negatives");
    }
    
    public void stringToArray(String word) {
        String[] stringArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            stringArray[i] = String.valueOf(word.charAt(i));
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("["+stringArray[i]+"]");
        }
    }
}
