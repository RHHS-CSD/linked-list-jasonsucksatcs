/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class Data implements Comparable<Data>{
    
    private String item;
    
    @Override
    public String toString(){
        return item;
    }
    
    @Override
    public boolean equals(Object o){
        //anything not of type Data is false
        if (! (o instanceof Data))
            return false;
        //add code to properly compare
        return item.equals(((Data)o).item);
    }

    @Override
    public int compareTo(Data o){
        return item.compareTo(((Data)o).item);
    }
}
