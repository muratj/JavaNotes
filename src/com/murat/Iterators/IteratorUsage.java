package com.murat.Iterators;

import java.util.*;

public class IteratorUsage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
//        it.next();
//        it.next();
//        System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next()+1);
        }

    }
}
