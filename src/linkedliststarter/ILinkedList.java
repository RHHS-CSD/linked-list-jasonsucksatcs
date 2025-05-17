/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public interface ILinkedList {
    public String toString();
public int size();
public void clear();
public boolean remove(Data item);
public boolean remove(int index);
public int indexOf(Data item);
public Data get(int index);
public boolean add(Data item);
public boolean add(Data item, int index);
}
