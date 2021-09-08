package com.kpi.fict.vh;

import com.kpi.fict.vh.immutable.ImmutableObject;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,2,3,4,5,6,7,8);
        String str = "Immutable String";
        int integer = 5;

        DefaultObject defaultObject = new DefaultObject(array);
        ImmutableObject immutableObject = new ImmutableObject(str, integer, defaultObject);

        System.out.println(immutableObject.getImmutableString());
        System.out.println(immutableObject.getImmutableInteger());
        System.out.println(immutableObject.getImmutableObjectType().getNumbers());

        str = "New String";
        integer = 6;
        defaultObject.addNumber(9);

        System.out.println(immutableObject.getImmutableString());
        System.out.println(immutableObject.getImmutableInteger());
        System.out.println(immutableObject.getImmutableObjectType().getNumbers());

        immutableObject.setString("New String");
        immutableObject.setInteger(6);
        immutableObject.setObject(new DefaultObject(Arrays.asList(1,2,3)));

        System.out.println(immutableObject.getImmutableString());
        System.out.println(immutableObject.getImmutableInteger());
        System.out.println(immutableObject.getImmutableObjectType().getNumbers());
    }
}