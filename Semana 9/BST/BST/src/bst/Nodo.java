/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Estudiantes
 */
public class Nodo {
    
    private int element;
    private Nodo rightSon,leftSon,father;

    public Nodo(int element) {
        this.element = element;
        this.rightSon = this.leftSon = this.father = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Nodo getRightSon() {
        return rightSon;
    }

    public void setRightSon(Nodo rightSon) {
        this.rightSon = rightSon;
    }

    public Nodo getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Nodo leftSon) {
        this.leftSon = leftSon;
    }

    public Nodo getFather() {
        return father;
    }

    public void setFather(Nodo father) {
        this.father = father;
    }
    
    
    
}
