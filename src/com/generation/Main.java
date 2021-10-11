package com.generation;

public class Main {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        boolean z = true;

        boolean a = (x && y) || (x && z);
        System.out.println("a "+a);

        boolean b = (x || !y) && (!x || z);
        System.out.println("b "+b);

        boolean c = x || y && z;
        System.out.println("c "+c);

        boolean d = !(x || y) && z;
        System.out.println("d "+d);

        boolean e = x || y || x && !z && !y;
        System.out.println("e "+e);

        boolean f = !x || !y || c && a && !b;
        System.out.println("f "+f);

        boolean ej = false && true && false || false;
        System.out.println("ej "+ej);


    }
}
