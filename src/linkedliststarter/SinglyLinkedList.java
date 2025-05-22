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
        //variables
        int length = 1;
        Node temp = head;
        //size is 0 when the list is empty
        if (head == null) {
            return 0;
        }
        //iterate through every element to determine the size of the list
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
        //variables
        Node n = head;
        Node next = null;
        //cannot remove anything from an empty list
        if (head == null) {
            return false;
        }
        //special case for removing first element
        if (n.getItem().equals(item)) {
            head = n.getNext();
            n.setNext(null);
            return true;
        }
        //search through the entire list for the element to be removed
        while (n != tail) {
            next = n.getNext();
            if (next.getItem().equals(item)) {
                if (next == tail) {
                    tail = n;
                }
                n.setNext(next.getNext());
                next.setNext(null);
                return true;
            }
            n = n.getNext();
        }
        //if the item cannot be found, return false
        return false;
    }

    /**
     * Remove the item from the particular index (Jason)
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        //variables
        int i = 1;
        Node n = head;
        Node next = null;
        //cannot remove anything from an empty list
        if (head == null) {
            return false;
        }
        //special case for removing first element
        if (index == 0) {
            head = n.getNext();
            n.setNext(null);
            return true;
        }
        //search through the entire list for the index to be removed
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
        //if the item cannot be found, return false
        return false;
    }

    /**
     * Returns the first found index of the given item (Cohen)
     * @param item The item to find
     * @return The index of the found item, or -1 if the item does not exist
     */
    @Override
    public int indexOf(Data item) {
        //varaibles
        int pos = 0;
        Node temp = head;
        //keep searching until the item is found
        while (temp != null) {
            if (temp.getItem().equals(item)) {
                return pos;
            }
            pos += 1;
            temp = temp.getNext();
        }
        //if the item is not found
        return -1;
    }

    /**
     * Retrieves the Data at the given index (Jason)
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    @Override
    public Data get(int index) {
        //variables
        int i = 0;
        Node n = head;
        //searches for the index of the item
        while (n != null) {
            if (i == index) {
                return n.getItem();
            }
            i++;
            n = n.getNext();
        }
        //if the item could not be found
        return null;
    }

    /**
     * Add the gen item to the end of the linked list (Cohen)
     * @param item Item to add
     * @return true if successfully added, false otherwise
     * (FYI it never returns false, will always work)
     */
    @Override
    public boolean add(Data item) {
        //variable temporary
        Node temp = head;
        //find the end of the list, add the item there
        while (temp != null) {
            if (temp == tail) {
                temp.setNext(new Node(item));
                tail = temp.getNext();
                return true;
            }
            temp = temp.getNext();
        }
        //if the list is empty, initialize head and tail pointers (special case)
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
        //variables
        int pos = 1;
        Node temp = head;
        Node next = null;
        //special case for adding to start of list
        if (index == 0) {
            head = new Node(item);
            //special case if empty list
            if (tail == null) {
                tail = head;
                return true;
            }
            head.setNext(temp);
            return true;
        }
        //adding to any other position (loop through elements)
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
        //index out of bounds
        return false;
    }
    
    /**
     * Given two parameters m and n, swap the element at index m with the element at index n (Jason)
     * @param m the index of the first element to be swapped
     * @param n the index of the second element to be swapped  
     * @return if the swap was successful, false if the index is out of bounds
     */
    public boolean swap(int m, int n) {
        //variables
        int i = 0;
        Node current = head;
        Node temp = new Node(null);
        Node first = null;
        Node second = null;
        //find the first and second elements
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
        //if any of the elements do not exist, return false
        if (first == null || second == null) {
            return false;
        }
        //switch places
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
        //does not do anything if the other list is null
        if (other != null) {
            //combines the lists
            tail.setNext(other.head);
            //if the list was empty (special case)
            if (head == null) {
                head = tail;
            }
            //set the new position of the tail
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
        //variables
        String string = "";
        Node temp = head;
        //add all elements to the string
        while (temp != null) {
            string += temp.getItem().toString();
            string += "\n";
            temp = temp.getNext();
        }
        return string;
    }
    
}
