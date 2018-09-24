package com.company;

import java.util.Comparator;

public class person implements Comparable<person> {

    private String name;
    private int age;

    public void print(){

        System.out.println("Name: "+ this.name + " Age: "+ this.age);

    }


    public int getage(){

        return this.age;
    }


    public String getname(){

        return this.name;

    }


    public void setname(String name){

        this.name=name;
    }


    public void setage(int age){

        this.age=age;

    }



    public int compareTo(person o) {

        return this.getname().compareTo(o.getname());

    }

    public boolean equals(String name){

        return name==this.name;

    }



    public int compare(person A, person B){

        return A.getname().compareTo(B.getname());


    }





    person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person "+ this.name+ "'ve added to set");

    }


}


class PersonNameCompare implements Comparator<person>{

    public int compare(person A, person B){

        return A.getname().compareTo(B.getname());

    }

}


class PersonAgeCompare implements Comparator<person>{

    public int compare(person A,person B){

        return A.getname().compareTo(B.getname());

    }
}