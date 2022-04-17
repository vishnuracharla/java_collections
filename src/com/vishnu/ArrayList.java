package com.vishnu;

import java.util.ArrayList;
import java.util.List;

class ArrayListMethod {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(26); list.add(28); list.add(29); list.add(21);


        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();

        newList.addAll(list.subList(0,1));

        System.out.println(newList);

        System.out.println(list);

        list.remove(2);

        list.remove(Integer.valueOf(21));

        list.clear();
    }

}
