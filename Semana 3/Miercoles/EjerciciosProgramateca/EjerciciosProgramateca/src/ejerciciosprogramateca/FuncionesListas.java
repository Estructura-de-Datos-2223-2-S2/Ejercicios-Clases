/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosprogramateca;

import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class FuncionesListas {
    
    public Lista flipList(Lista list) {
        Lista newList = new Lista();
        Nodo pointer = list.getHead();
        while (pointer != null) {
            newList.insertBegin(pointer.getElement());
            pointer = pointer.getNext();
        }
        return newList;
    }
    
    public Lista flipDeleteList(Lista list) {
        Lista newList = new Lista();
        Nodo pointer = list.getHead();
        while (pointer != null) {
            newList.insertBegin(pointer.getElement());
            pointer = pointer.getNext();
            list.deleteBegin();
        }
        return newList;
    }
    
    public Lista concatenateLists(Lista list1, Lista list2){
        Nodo pointer1 = list1.getHead();
        Nodo pointer2 = list2.getHead();
        Lista listaFinal = new Lista();
        
        while (pointer1 != null || pointer2 != null) {
            if(pointer1 != null && pointer2 != null) {
                if(pointer1.getElement() < pointer2.getElement()) {
                    listaFinal.insertFinal(pointer1.getElement());
                    pointer1 = pointer1.getNext();
                    list1.deleteBegin();
                } else if(pointer1.getElement() > pointer2.getElement()) {
                    listaFinal.insertFinal(pointer2.getElement());
                    pointer2 = pointer2.getNext();
                    list2.deleteBegin();
                } else {
                    listaFinal.insertFinal(pointer1.getElement());
                    listaFinal.insertFinal(pointer2.getElement());
                    pointer1 = pointer1.getNext();
                    pointer2 = pointer2.getNext();
                    list1.deleteBegin();
                    list2.deleteBegin();
                }
            } else if(pointer1 == null) {
                listaFinal.insertFinal(pointer2.getElement());
                pointer2 = pointer2.getNext();
                list2.deleteBegin();
            } else if (pointer2 == null) {
                listaFinal.insertFinal(pointer1.getElement());
                pointer1 = pointer1.getNext();
                list1.deleteBegin();
            }
        }
        
        return listaFinal;
    }
    
}
