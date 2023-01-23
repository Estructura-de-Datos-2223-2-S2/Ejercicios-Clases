package listas;

public class Nodo {
    private Libro element;
    private Nodo next;

    public Nodo(Libro elemento) {
        this.element = elemento;
        this.next = null;
    }

    public Libro getElement() {
        return element;
    }

    public void setElement(Libro elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }
    
    
    
    
}
