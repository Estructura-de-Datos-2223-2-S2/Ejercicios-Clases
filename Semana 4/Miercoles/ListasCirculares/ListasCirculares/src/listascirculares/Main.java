package listascirculares;


public class Main {

    public static void main(String[] args) {
        ListaCircular list = new ListaCircular();
        list.insertBegin(1);
        list.insertFinal(2);
        list.insertFinal(3);
        list.insertFinal(4);
        list.insertBegin(5);
        list.printList();
        list.insertInIndex(1, 8);
        System.out.println("NUEVA LISTA 1");
        list.printList();
        list.insertInIndex(2, 20);
        System.out.println("NUEVA LISTA 12");
        list.printList();
        list.insertInIndex(3, 12);
        System.out.println("NUEVA LISTA 2");
        list.printList();
        list.insertInIndex(6, 15);
        System.out.println("NUEVA LISTA 3");
        list.printList();
        System.out.println("DELETE ELEMENT");
        /*list.deleteElement(8);
        list.deleteElement(15);
        list.deleteElement(15);*/
        list.printList();
        list.deleteBegin();
        list.deleteFinal();
        System.out.println("NUEVA LISTA DELETE");
        list.printList();
        System.out.println("NUEVA LISTA DELETE FINAL");
        list.deleteInIndex(4);
        list.printList();
        System.out.println("NUEVA LISTA DELETE FINAL 2");
        list.deleteInIndex(4);
        list.printList();
    }
    
}
