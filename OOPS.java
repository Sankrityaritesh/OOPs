package com.ritesh;
class Pen{
    String colour;
    String type;

    public void write(){
        System.out.println("writing something");
    }
}

public class OOPS{
    public static void main(String args[]){
        Pen pen1= new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        pen1.write();
    }
}