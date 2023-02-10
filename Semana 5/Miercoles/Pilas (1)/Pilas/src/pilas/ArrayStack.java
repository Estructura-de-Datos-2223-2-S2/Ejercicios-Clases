package pilas;

public class ArrayStack implements IPilas{

    private NodoArray[] array;
    private int peek;
    private int maxSize;
    private int size;

    public ArrayStack(int size) {
        this.size = 1;
        this.array = new NodoArray[1];
        this.maxSize = size;
        this.peek = 0;
    }
    
    
    @Override
    public void push(Object object) {
        NodoArray node = new NodoArray(object);
        if (isEmpty()) {
            getArray()[0] = node;
        } else {
            int position = searchSpace();
            if(position != -1) {
                getArray()[position] = node;
                node.setNext(getPeek());
                setPeek(position);
                setSize(getSize());
            } else {
                if (getSize() == getMaxSize()) {
                    System.out.println("No hay espacio disponible");
                } else {
                    NodoArray[] newArray = new NodoArray[getSize()+1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    node.setNext(getPeek());
                    setPeek(getSize());
                    newArray[getSize()] = node;
                    setSize(getSize()+1);
                    setArray(newArray);
                }
            }
        }
    }

    @Override
    public Object pop() {
        NodoArray pointer = getArray()[getPeek()];
        getArray()[getPeek()] = null;
        setPeek(pointer.getNext());
        return pointer.getElement();
    }

    @Override
    public Integer getPeek() {
        return peek;
    }

    public void setPeek(int peek) {
        this.peek = peek;
    }
    
    @Override
    public boolean isEmpty() {
        return getArray()[getPeek()] == null; 
    }
    
    public NodoArray[] getArray() {
        return array;
    }
    
    public void setArray(NodoArray[] array) {
        this.array = array;
    }
    
    public int getMaxSize() {
        return maxSize;
    }
    
    public void setMaxSize(int size) {
        this.maxSize = size;
    }
            
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public int searchSpace() {
        for (int i = 0; i < getSize(); i++) {
            if(getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }
    
    public void printStack(){
        NodoArray pointer = getArray()[getPeek()];
        while (pointer.getNext() != null) {
            System.out.println("element:"+pointer.getElement());
            pointer = getArray()[pointer.getNext()];
        }
        System.out.println("element:"+pointer.getElement());
    }
}
