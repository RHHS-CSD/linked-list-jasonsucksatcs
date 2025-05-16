/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    
    private Node head;
    private Node tail;

    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Reset / Empty the LinkedList
     * Jason did this method
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    /**
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     * Jason did this method 
     */
    @Override
    public boolean remove(Data item) {
        Node n = head;
        Node next = null;
        while (n != tail) {
            next = n.getNext();
            if (next.getItem() == item) {
                n.setNext(next.getNext());
                next.setNext(null);
                return true;
            }
            n = n.getNext();
        }
        return false;
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     * Jason did this method 
     */

    public boolean remove(int index) {
        int i = 0;
        Node n = head;
        Node next = null;
        while (n != tail) {
            next = n.getNext();
            if (i == index) {
                n.setNext(next.getNext());
                next.setNext(null);
                return true;
            }
            i++;
            n = n.getNext();
        }
        return false;
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     * Jason did this method 
     */
    
    @Override
    public Data get(int index) {
        int i = 0;
        Node n = head;
        while (n != tail) {
            n = n.getNext();
            if (i == index) {
                return n.getItem();
            }
            i++;
        }
        return null;
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(String item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(String item, int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void swap() {
        
    }
    
    public void join() {
    
    }
}
