
package pilas;

public interface IPilas {
    
    void push(Object object);
    
    Object pop();
    
    Object getPeek();
    
    void setPeek(Nodo peek);
    
    boolean isEmpty();
    
}
