package arboles;

public class Tree {
    private Nodo root;

    public Tree() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public boolean isLeaf(Nodo node) {
        return (node.getSons() == null || node.getSons().length == 0);
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void insertRecursive(Integer element, Integer father, Nodo pointer){
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setRoot(node);
        } else {
            // Si el padre que estoy buscando ya lo consegui
            if (pointer.getElement() == father) {
                increaseSons(node, pointer);
            } else {
                for (int i = 0; i < pointer.getSons().length; i++) {
                    if(pointer.getSons()[i].getElement() == father) {
                        increaseSons(node, pointer.getSons()[i]);
                    } else {
                        insertRecursive(element, father, pointer.getSons()[i]);
                    }
                }
                
            }
        }
    }
    
    public void increaseSons(Nodo node,Nodo father) {
        Nodo[] newSons = copySons(father.getSons());
        newSons[newSons.length-1] = node;
        father.setSons(newSons);
    }
    
    public Nodo[] copySons(Nodo[] sons) {
        if (sons != null) {
            Nodo[] newSons = new Nodo[sons.length +1];
            for (int i = 0; i < sons.length; i++) {
               newSons[i] = sons[i];
            }
            return newSons;
        }
        return new Nodo[1];
    }
    
    public void printPreOrden(Nodo root){
        System.out.println("{"+root.getElement()+"}");
        for (int i = 0; i < root.getSons().length; i++) {
            printPreOrden(root.getSons()[i]);
            
        }
    }
}