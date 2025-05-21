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
        while (temp != tail) {
            temp = temp.getNext();
            length += 1;
        }
        return length;
    }

    /**
     * Reset / Empty the LinkedList (Jason)
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
    }

    /**
     * Remove the first instance of item from the linked list (Jason)
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
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
     * Remove the item from the particular index (Jason)
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
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
            if (temp.getItem().equals(item)) {
                return pos;
            }
            pos += 1;
            temp = temp.getNext();
        }
        return -1;
    }

    /**
     * Retrieves the Data at the given index (Jason)
     * @param index The index to be retrieved
     * @return The data item, null if bad index
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
     * Add the item to the linked list at the given position (Cohen)
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfully added, false otherwise
     */
    @Override
    public boolean add(Data item, int index) {
        int pos = 1;
        Node temp = head;
        Node next = null;
        if (index == 0) {
            head = new Node(item);
            if (head == null) {
                tail = head;
                return true;
            }
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
    
    /**
     * Given two parameters m and n, swap the element at index m with the element at index n (Jason)
     * @param m the index of the first element to be swapped
     * @param n the index of the second element to be swapped  
     * Method doesn't return anything 
     */
    public boolean swap(int m, int n) {
        int i = 0;
        Node current = head;
        Node temp = new Node(null);
        Node first = null;
        Node second = null;
        while (current != tail) {
            if (i == m) {
                first = current;
            }
            else if (i == n) {
                second = current;
            }
            i++;
            current = current.getNext();
        }
        if (first == null || second == null) {
            return false;
        }
        temp.setItem(first.getItem());
        first.setItem(second.getItem());
        second.setItem(temp.getItem());
        return true;
    }
    
    /**
     * Concatenates another linked list to this one (Cohen)
     * @param other the other linked list
     */
    public void join(SinglyLinkedList other) {
        if (other != null) {
            tail.setNext(other.head);
            if (head == null) {
                head = tail;
            }
            Node temp = head;
            while (temp != null) {
                if (temp.getNext() == null) {
                    tail = temp;
                }
                temp = temp.getNext();
            }
        }
    }
    
    /**
     * creates a String representation of the list
     * @return the String
     */
    @Override
    public String toString() {
        String string = "";
        Node temp = head;
        while (temp != null) {
            string += temp.getItem().toString();
            string += "\n";
            temp = temp.getNext();
        }
        return string;
    }
    
}
