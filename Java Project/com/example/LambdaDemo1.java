package com.example;
public class LambdaDemo1 {
public static void main(String[] args) {
   // f1(new HelloImpl(),"Albin");
    Hello h = (String name) ->{
        System.out.println("Hello "+name +" Good morning");
    };
    h.sayHello("Albin");
    f1(h,"Raj");

    f1((name) -> System.out.println("Hello "+name +" Good morning")
    ,"Albin");
}
  static  void f1(Hello h,String n){
    h.sayHello(n);
  }
}

interface Hello{
    void sayHello(String name);
}
class HelloImpl implements  Hello{
    public void sayHello(String name) {
        System.out.println("Hello "+name +" Good morning");
    }
    
}