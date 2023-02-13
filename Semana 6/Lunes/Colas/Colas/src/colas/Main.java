package colas;

public class Main {


    public static void main(String[] args) {
        ColaArray colaArray = new ColaArray();
        colaArray.encolar('A');
        colaArray.encolar('B');
        colaArray.encolar('C');
        colaArray.encolar('D');
        colaArray.encolar('E');
        colaArray.encolar('F');
        colaArray.encolar('G');
        colaArray.encolar('H');
        colaArray.encolar('I');
        colaArray.printQueue();
        /*
        Cola queue = new Cola();
        queue.encolar('A');
        queue.encolar('B');
        queue.encolar('C');
        queue.encolar('D');
        queue.encolar('E');
        queue.encolar('F');
        queue.encolar('G');
        queue.encolar('H');
        queue.encolar('I');
        queue.printQueue();
        System.out.println("Nueva Cola");
        queue.desencolar();
        queue.desencolar();
        queue.desencolar();
        queue.desencolar();
        queue.desencolar();
        queue.printQueue();
        char element = queue.despachar().getElement();
        System.out.println("Elemento despachado:" + element);
        System.out.println("Cola Final:");
        queue.printQueue();*/
        
    }
    
}
