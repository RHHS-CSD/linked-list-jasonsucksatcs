/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */

public class Node {
    
    private Data item = null;
    private Node next = null;

    public Node(Data insert) {
        item = insert;
    }
    
    public Data getItem() {
        return item;
    }
    
    public void setItem(Data I) {
        item = I;
    }
    
    public void setNext(Node n) {
        next = n;
    }
    
    public Node getNext () {
        return next;
    }

}