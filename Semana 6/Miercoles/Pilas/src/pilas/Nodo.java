package pilas;

public class Nodo {
    private Object element;
    private Nodo next;

    public Nodo(Object elemento) {
        this.element = elemento;
        this.next = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }
    
    
    
    
}
