package colas;

public class Nodo {
    private char element;
    private Nodo next;

    public Nodo(char elemento) {
        this.element = elemento;
        this.next = null;
    }

    public char getElement() {
        return element;
    }

    public void setElement(char elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }
    
    
    
    
}
