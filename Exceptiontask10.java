package PracticeSet.atlaslearnings.day09;

import java.util.*;
public class Exceptiontask10 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();

        al.add("Abdul");
        al.add("Samad");
        System.out.println("Orignal List : "+al);

        al.add(1, "Hello");
        System.out.println("After Adding element at index 1 : "+ al);

        al.remove(0);
        System.out.println("Element removed from index 0 : "+ al);

        al.remove("Prasunamba");
        System.out.println("Element Prasunamba removed : "+ al);

        al.set(0, "K");
        System.out.println("List after updation of value : "+al);
    }
}

