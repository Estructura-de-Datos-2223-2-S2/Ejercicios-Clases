package colas;

import java.util.Vector;

public class ColaArray implements IColas {
    private NodoArray[] array;
    private Integer head, tail;
    private int size,maxSize;

    public ColaArray() {
        array = new NodoArray[1];
        this.head = 0;
        this.tail = 0;
        this.size = 1;
        this.maxSize = 10;
    }

    public NodoArray[] getArray() {
        return array;
    }

    public void setArray(NodoArray[] array) {
        this.array = array;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public Integer getTail() {
        return tail;
    }

    public void setTail(Integer tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public NodoArray encolar(char character) {
        NodoArray node = new NodoArray(character);
        if (isEmpty()) {
            getArray()[getHead()] = node;
            setTail(getHead());
        } else {
            if (getSize() >= getMaxSize()) {
                System.out.println("No hay espacio disponible");
            } else {
                int position = searchSpace();
                if(position == -1) {
                    NodoArray[] newArray = new NodoArray[getSize()+1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i]; 
                    }
                    newArray[getSize()] = node;
                    getArray()[getTail()].setNext(getSize());
                    setTail(getSize());
                    setSize(getSize()+1);
                    setArray(newArray);
                    
                } else {
                    getArray()[position] = node;
                    getArray()[getTail()].setNext(position);
                    setTail(position);
                }
            }
        }
        return node;
    }
    
    public int searchSpace() {
        for (int i = 0; i < getSize(); i++) {
            if (getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void desencolar() {
        if (!isEmpty()) {
            if (getSize() == 1) {
                setArray(new NodoArray[1]);
                setSize(1);
                setHead(0);
                setTail(0);
            }
            NodoArray pointer = getArray()[getHead()];
            getArray()[getHead()] = null;
            setHead(pointer.getNext());
            pointer.setNext(null);
        }
    }

    @Override
    public NodoArray despachar() {
        if (!isEmpty()) {
            if (getSize() == 1) {
                setArray(new NodoArray[1]);
                setSize(1);
                setHead(0);
                setTail(0);
            }
            NodoArray pointer = getArray()[getHead()];
            getArray()[getHead()] = null;
            setHead(pointer.getNext());
            pointer.setNext(null);
            return pointer;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return getArray()[getHead()] == null;
    }

    @Override
    public void printQueue() {
        NodoArray pointer = getArray()[getHead()];
        while (pointer.getNext() != null) {
            System.out.println("NODO:"+pointer.getElement());
            pointer = getArray()[pointer.getNext()];
        }
        System.out.println("NODO:"+ getArray()[getTail()].getElement());
    }
    
    public void printVector() {
        System.out.println("VECTOR");
        for (int i = 0; i < getArray().length; i++) {
            if (getArray()[i] != null) {
                System.out.println("Pos:"+i+" value:"+getArray()[i].getElement());    
            } else {
                System.out.println("Pos:"+i+" value:"+getArray()[i]);    

            }
        }
    }
    
}
