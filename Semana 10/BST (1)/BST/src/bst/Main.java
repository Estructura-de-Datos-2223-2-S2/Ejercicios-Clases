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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertNodo(tree.getRoot(),20);
        tree.insertNodo(tree.getRoot(),10);
        tree.insertNodo(tree.getRoot(),30);
        tree.insertNodo(tree.getRoot(),5);
        tree.insertNodo(tree.getRoot(),25);
        tree.insertNodo(tree.getRoot(),40);
        tree.insertNodo(tree.getRoot(),33);
        //tree.insertNodo(tree.getRoot(),28);

        tree.deleteNodo(tree.getRoot(), 30);
        tree.preOrden(tree.getRoot());
       
        /*
        tree.preOrden(tree.getRoot());
        System.out.println("ELIMINAR");
        tree.deleteNodo(tree.getRoot(), 10);
        tree.insertNodo(tree.getRoot(), 1);
        tree.insertNodo(tree.getRoot(), 8);
        System.out.println("");
        tree.preOrden(tree.getRoot());
*/
    }
    
}
