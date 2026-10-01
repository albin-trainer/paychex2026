package com.example;

public class LambdaDemo2 {
public static void main(String[] args) {
    //create a Lambda expression of theh functional interface
    //and pass to doMaths method
    Calculator c1= (float a, float b )->{return a+b;};
    Calculator c2= (a, b )->{return a+b;};
     Calculator c3= (a, b )->  a+b;;
     doMaths(c1, 9, 89);

     doMaths((a,b)->a*b, 8, 9);

}
static void doMaths(Calculator c, float x, float y){
    System.out.println("Result : "+c.eval(x, y));
}
}
@FunctionalInterface  //it ensures only one abtract method 
interface Calculator{
    float eval(float a, float b);
   // void f1();
}

