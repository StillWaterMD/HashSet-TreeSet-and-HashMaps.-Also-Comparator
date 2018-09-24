package com.company;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


/*
        Comparator <person> compare= new PersonNameCompare().thenComparing(new PersonAgeCompare());
        TreeSet<person> set= new TreeSet<>(compare);

        set.add(new person("vasya",13));
        set.add(new person("Shakespear", 13));
        set.add(new person("Albert",18));
        set.add(new person("Qubert",20));
        set.add(new person("Qubert",21));

        for( person i:set){
            i.print();
        }
*/

        HashMap<Integer,person> map=new HashMap<Integer,person>();

        int key=0;

        map.put(key++,new person("vasya",13));
        map.put(key++,new person("Shakespear", 13));
        map.put(key++,new person("Albert", 35));
        map.put(key++,new person("Shakespear", 13));
        map.put(key++,new person("Shakespear", 13));





       for( Map.Entry<Integer,person> i:map.entrySet()){

           i.getValue().print();

       }

/*
        for(int i: map.keySet()){

            map.get(i).print();

        }

*/




    }
}
