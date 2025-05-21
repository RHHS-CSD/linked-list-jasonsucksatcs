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
    
    private String code;
    private String teacher;
    private int period;
    
    public void Data (String c, String t, int p) {
        this.code = c;
        this.teacher = t;
        this.period = p;
    }
    
    @Override
    public String toString(){
        return code + teacher + period;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Data && code.equals(((Data)o).getCode()) && teacher.equals(((Data)o).getTeacher()) && period == (((Data)o).getPeriod())) {
            return true;
        }
        else {
            return false;
        } 
    }

    @Override
    public int compareTo(Data o){
        return (this.period - o.period);
    }
}