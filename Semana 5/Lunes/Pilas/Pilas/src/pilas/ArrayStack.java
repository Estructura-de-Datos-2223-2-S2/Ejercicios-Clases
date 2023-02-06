package pilas;

public class ArrayStack implements IPilas{

    private Object[] array;

    public ArrayStack(int size) {
        this.array = new Object[size];
    }
    
    
    @Override
    public void push(Object object) {
        
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getPeek() {
        if (isEmpty()) {
            return null;
        }
        return array[0];
    }

    @Override
    public void setPeek(Nodo peek) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
