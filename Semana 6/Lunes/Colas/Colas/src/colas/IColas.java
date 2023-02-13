package colas;

public interface IColas {
    public Object encolar(char character);
    public void desencolar();
    public Nodo despachar();
    public boolean isEmpty();
    public void printQueue();
}
