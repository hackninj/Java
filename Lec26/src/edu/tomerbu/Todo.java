package edu.tomerbu;

import java.lang.Object;


public class Todo extends Object implements Cloneable{
    private String mission;
    private String status;

    //ctor
    public Todo(String mission, String status) {
        this.mission = mission;
        this.status = status;
    }
    //toString
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Todo{" +
                "mission='" + mission + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
