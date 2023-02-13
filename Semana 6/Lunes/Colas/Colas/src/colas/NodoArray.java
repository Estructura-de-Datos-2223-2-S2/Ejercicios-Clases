package colas;

public class NodoArray {
    private char element;
    private Integer next;

    public NodoArray(char elemento) {
        this.element = elemento;
        this.next = null;
    }

    public char getElement() {
        return element;
    }

    public void setElement(char elemento) {
        this.element = elemento;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer siguiente) {
        this.next = siguiente;
    }
    
    
    
    
}
