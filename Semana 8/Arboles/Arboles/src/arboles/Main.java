/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertRecursive(5, null, tree.getRoot());
        
        tree.insertRecursive(4, 5, tree.getRoot());
        tree.insertRecursive(6, 5, tree.getRoot());
        
        tree.insertRecursive(2, 4, tree.getRoot());
        tree.insertRecursive(3, 4, tree.getRoot());
        tree.printPreOrden(tree.getRoot());
    }
    
}
