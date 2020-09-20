package org.launchcode.java.exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListAdder {
    public static ArrayList<Integer> sumArrayList(ArrayList<Integer> first, ArrayList<Integer> second) {

        // check the lengths of the arrayLists
        if (first.size() > second.size()) {
            //for each element in the longer arrayList
            return sumLonger(first, second);
        } else {
            return sumLonger(second, first);
        }
    }

    public static ArrayList<Integer> sumLonger(ArrayList<Integer> longer, ArrayList<Integer> shorter) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < longer.size(); i++) {

            //if i haven't run out of the ints from the shorter list
            if (i < shorter.size()) {
                Integer sum = longer.get(i) + shorter.get(i);
                result.add(sum);
            } else {
                //just keep the value from the longer list
                result.add(longer.get(i));
            }
        }

            return result;
        }




    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(6);

        ArrayList<Integer> result = sumArrayList(first, second);
        System.out.println(result);

    }

}
