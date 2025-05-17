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
     * Return the size of the Linked List (Cohen)
     * @return an int representing the size
     *
     */
    @Override
    public int size() {
        int length = 1;
        Node temp = head;
        if (head == null) {
            return 0;
        }
        if (head == tail) {
            return 1;
        }
        while (temp != tail) {
            temp = temp.getNext();
            length += 1;
        }
        return length;
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
        if (head == null) {
            return false;
        }
        if (n.getItem() == item) {
            head = n.getNext();
            n.setNext(null);
            return true;
        }
        while (n != tail) {
            next = n.getNext();
            if (next.getItem() == item) {
                if (next == tail) {
                    tail = n;
                }
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
        if (head == null) {
            return false;
        }
        if (index == 0) {
            head = n.getNext();
            n.setNext(null);
            return true;
        }
        while (n != tail) {
            next = n.getNext();
            if (i == index) {
                if (next == tail) {
                    tail = n;
                }
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
     * Returns the first found index of the given item (Cohen)
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        int pos = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.getItem() == item) {
                return pos;
            }
            pos += 1;
            temp = temp.getNext();
        }
        return -1;
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
        while (n != null) {
            if (i == index) {
                return n.getItem();
            }
            i++;
            n = n.getNext();
        }
        return null;
    }

    /**
     * Add the gen item to the end of the linked list (Cohen)
     * @param item Item to add
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item) {
        Node temp = head;
        while (temp != null) {
            if (temp == tail) {
                temp.setNext(new Node(item));
                tail = temp.getNext();
                return true;
            }
            temp = temp.getNext();
        }
        head = new Node(item);
        tail = head;
        return true;
    }

    /**
     * Add the gen item to  the linked list at the given position (Cohen)
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item, int index) {
        int pos = 1;
        Node temp = head;
        Node next = null;
        if (head == null) {
            head = new Node(item);
            tail = head;
            return true;
        }
        if (index == 0) {
            head = new Node(item);
            head.setNext(temp);
            return true;
        }
        while (temp != null) {
            next = temp.getNext();
            if (pos == index) {
                temp.setNext(new Node(item));
                temp.getNext().setNext(next);
                if (temp == tail) {
                    tail = temp.getNext();
                }
                return true;
            }
            pos += 1;
            temp = temp.getNext();
        }
        return false;
    }
    
    public void swap(int m, int n) {
        
    }
    
    /**
     * Concatenates another linked list to this one (Cohen)
     * @param other the other linked list
     */
    public void join(SinglyLinkedList other) {
        tail.setNext(other.head);
    }
}
