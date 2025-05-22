/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        SinglyLinkedList sli2 = new SinglyLinkedList();
        String code = "ICS4U1";
        String teacher = "Mr.RD";
        int period = 4;
        Data d = new Data(code, teacher, period);
        sli1.add(d,0);
        code = "YXM4UE";
        teacher = "Mr.PW";
        period = 2;
        d = new Data(code, teacher, period);
        sli1.add(d,0);
        code = "DPQ1UE";
        teacher = "Mr.HF";
        period = 1;
        d = new Data(code, teacher, period);
        sli1.add(d,0);
        code = "WHC1UE";
        teacher = "Mr.MV";
        period = 3;
        d = new Data(code, teacher, period);
        sli1.add(d,2);
        code = "LLC1UE";
        teacher = "Mr.AL";
        period = 5;
        d = new Data(code, teacher, period);
        sli1.add(d,4);
        System.out.println(sli1);
    }
}
