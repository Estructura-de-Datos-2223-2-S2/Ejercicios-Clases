package ejerciciosprogramateca;

import java.util.Scanner;

public class EjerciciosProgramateca {

 
    public static void main(String[] args) {
        System.out.println("*** WELCOME ***");
        System.out.println("Please enter a valid option: \n1-Flip List\n2-Flip List Deleting\n3-Concatenate Lists\n->");
        Scanner sc = new Scanner(System.in);
        Lista list = new Lista();
        list.insertFinal(1);
        list.insertFinal(2);
        list.insertFinal(3);
        list.insertFinal(4);
        list.insertFinal(5);
        list.insertFinal(6);
        FuncionesListas functions = new FuncionesListas();
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Lista Original:");
            list.printList();
            System.out.println("Lista Invertida:");
            Lista listFlipped = functions.flipList(list);
            listFlipped.printList();
        } else if (option == 2) {
            System.out.println("Lista Original:");
            list.printList();
            System.out.println("Lista Invertida:");
            Lista listFlipped = functions.flipDeleteList(list);
            listFlipped.printList();
            System.out.println("Lista Original:");
            list.printList();
        } else if (option == 3){
            System.out.println("Lista 1:");
            Lista list1 = new Lista();
            list1.insertFinal(1);
            list1.insertFinal(4);
            list1.insertFinal(7);
            list1.insertFinal(8);
            list1.insertFinal(10);
            list1.insertFinal(15);
            list1.printList();
            
            System.out.println("Lista 2:");
            Lista list2 = new Lista();
            list2.insertFinal(2);
            list2.insertFinal(3);
            list2.insertFinal(5);
            list2.insertFinal(6);
            list2.insertFinal(9);
            list2.insertFinal(12);
            list2.printList();
            
            System.out.println("Lista Resultado:");
            Lista listFinal = functions.concatenateLists(list1, list2);
            listFinal.printList();
        }
    }
    
}
