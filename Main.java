import java.io.*;
class Parent 
{ 
    void show() 
    { 
        System.out.println("i am parent class show");
        } 
} 
class Child extends Parent 
{ 
    void show() 
    { 
        System.out.println("i am child class show");
        
    } 
} 
class Main 
{ 
    public static void main(String[] args) 
    { 
        Parent obj1 = new Parent(); 
        obj1.show(); 
        Parent obj2 = new Child(); 
        obj2.show(); 
    } 
} 
