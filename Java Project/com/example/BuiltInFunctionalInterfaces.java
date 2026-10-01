package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {
public static void main(String[] args) {
    List<String> names=new ArrayList<>();
    names.add("Supriya");
    names.add("Neeta");
    names.add("Saanvi");
    names.add("Gaurav");
    names.add("Manaas");
    names.add("Raj");

 /*  for(String n:names){
        System.out.println(n);
    }*/
    Consumer<String> consumer= (n)->System.out.println(n);
    names.forEach(consumer);
    System.out.println("-----------");

    names.forEach(n->System.out.println(n));
    Predicate<String> predicate=n->n.equals("Raj");

    names.removeIf(predicate);
    System.out.println("---after predicate---");
     names.forEach(consumer);
    System.out.println("-----------");

}
}
