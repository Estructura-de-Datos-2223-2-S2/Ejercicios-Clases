package pilas;

public class Stack implements IPilas{
    private Nodo peek;

    public Stack() {
        this.peek = null;
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
    }

    @Override
    public Object pop() {
        if (!isEmpty()){
            Nodo pointer = getPeek();
            setPeek(pointer.getNext());
            pointer.setNext(null);
            return pointer.getElement();
        }
        return null;
    }

}
