package com.example.beans;

public class HelloBeanImpl implements HelloBean {
    private String msg;
   public HelloBeanImpl(){
    System.out.println("Constructor");
   }
   
    public void setMsg(String msg) {
        System.out.println("setter called ...");
        this.msg = msg;
    }
    @Override
    public String sayHello(String name) {
        return  "Hi "+name+" "+msg;
    }


}
