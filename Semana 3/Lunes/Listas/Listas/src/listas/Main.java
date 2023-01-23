
package listas;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter","J.K. Rowling","VE-123");
        Libro libro2 = new Libro("Señor de los ","Pedro Perez","VE-155");
        Libro libro3 = new Libro("100 años de soledad","Gabriel Garcia Marquez","VE-844");
        Libro libro4 = new Libro("El Principito","Antonio Zambrano","VE-555");
        
        Listas list = new Listas();
        list.insertBegin(libro4);
        list.insertFinal(libro3);
        list.insertFinal(libro2);
        list.insertFinal(libro1);
        list.insertBegin(libro1);
        list.printList();
        list.insertInIndex(2, libro1);
        System.out.println("NUEVA LISTA");
        list.printList();
        list.deleteBegin();
        list.deleteFinal();
        System.out.println("NUEVA LISTA DELETE");
        list.printList();
        System.out.println("NUEVA LISTA DELETE FINAL");
        list.deleteInIndex(1);
        list.printList();

    }
    
}
