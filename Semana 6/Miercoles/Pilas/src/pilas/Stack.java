package pilas;

public class Stack implements IPilas{
    private Nodo peek;
    private int size;

    public Stack() {
        this.peek = null;
        this.size = 0;
    }

    @Override
    public Nodo getPeek() {
        return peek;
    }

    public void setPeek(Nodo peek) {
        this.peek = peek;
    }
    
    @Override
    public boolean isEmpty(){
        return peek == null;
    }
    
    @Override
    public void push(Object object) {
        Nodo node = new Nodo(object);
        if (isEmpty()) {
            setPeek(node);
        } else {
            node.setNext(peek);
            setPeek(node);
        }
        setSize(getSize()+1);
    }
    
    public void append(Object object) {
        Nodo node = new Nodo(object);
        if (isEmpty()) {
            setPeek(node);
        } else {
            Nodo pointer = getPeek();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
        setSize(getSize()+1);
    }

    @Override
    public Object pop() {
        if (!isEmpty()){
            Nodo pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            setSize(getSize()-1);
            return pointer.getElement();
        }
        return null;
    }
    
    public void printStack() {
        Nodo pointer = getPeek();
        while (pointer != null) {
            System.out.println("Nodo"+pointer.getElement());
            pointer = pointer.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    

}
