package colas;

public class Cola implements IColas {
    private Nodo head, tail;
    private int size;

    public Cola() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public boolean isEmpty(){
        return head == null;
    }
    
    @Override
    public Nodo encolar(char character){
        Nodo node = new Nodo(character);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            Nodo pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        }
        size++;
        return node;
    }
    
    @Override
    public Nodo despachar(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
            return pointer;
        }
        return null;
    }
    
    @Override
    public void desencolar(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null){
                setTail(null);
            }
            size--;
        }
    }
    
    @Override
    public void printQueue(){
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.println("NODO:"+pointer.getElement());
            pointer = pointer.getNext();
        }
    }
    
}
