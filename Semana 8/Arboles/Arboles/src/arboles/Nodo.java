package arboles;


public class Nodo {
    private Integer element;
    private Nodo[] sons;
    private Nodo rightBrother;

    public Nodo(Integer element) {
        this.element = element;
        this.sons = new Nodo[0];
        this.rightBrother = null;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }

    public Nodo getRightBrother() {
        return rightBrother;
    }

    public void setRightBrother(Nodo rightBrother) {
        this.rightBrother = rightBrother;
    }
    
    
    
}
