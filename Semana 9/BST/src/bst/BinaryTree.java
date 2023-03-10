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
public class BinaryTree {
    
    private Nodo root;

    public BinaryTree() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public void insertNodo(Nodo raiz, int element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (element <= raiz.getElement()) {
                if(raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getLeftSon(),element);
                }
            } else {
                if(raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getRightSon(),element);
                }
            }
        }
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void preOrden(Nodo root) {
        if (root != null) {
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }
    
    public void inOrden(Nodo root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getRightSon());
        }
    }
    
    public void postOrden(Nodo root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
            System.out.println("{ "+root.getElement()+" }");
        }
    }
    
    public void deleteNodo(Nodo raiz, int element) {
        if (!isEmpty()) {
            if (raiz == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (element == raiz.getElement()) {
                    if (raiz.getLeftSon() == null && raiz.getRightSon() == null) {
                        // Es una Hoja
                        if (element < raiz.getFather().getElement()) {
                            raiz.getFather().setLeftSon(null);
                        } else {
                            raiz.getFather().setRightSon(null);
                        }
                        raiz.setFather(null);
                    } else if(raiz.getLeftSon() == null) {
                        // Tiene solo hijo derecho
                        if (element < raiz.getFather().getElement()) {
                            raiz.getFather().setLeftSon(raiz.getRightSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getRightSon());
                        }
                        raiz.getRightSon().setFather(raiz.getFather());
                        raiz.setRightSon(null);
                        raiz.setFather(null);
                    } else if(raiz.getRightSon() == null) {
                        // Tiene solo hijo izquierdo
                        if (element < raiz.getFather().getElement()) {
                            raiz.getFather().setLeftSon(raiz.getLeftSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getLeftSon());
                        }
                        raiz.getLeftSon().setFather(raiz.getFather());
                        raiz.setLeftSon(null);
                        raiz.setFather(null);
                    }
                } else if(element < raiz.getElement()){
                    deleteNodo(raiz.getLeftSon(), element);
                } else {
                    deleteNodo(raiz.getRightSon(), element);
                }
            }
        } else {
            System.out.println("No hay elementos para eliminar");
        }
    }
    
}
