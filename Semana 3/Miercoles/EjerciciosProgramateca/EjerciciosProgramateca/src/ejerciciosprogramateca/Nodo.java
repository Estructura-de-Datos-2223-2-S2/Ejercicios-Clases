package ejerciciosprogramateca;

public class Nodo {
    private int element;
    private Nodo next;

    public Nodo(int elemento) {
        this.element = elemento;
        this.next = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }
    
    
    
    
}
