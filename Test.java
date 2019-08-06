import java.io.*;
import java.lang.*;
/*super keyword program*/

class A
{ 
    void message() 
    { 
        System.out.println("This is class A"); 
    } 
} 
  
class B extends A 
{ 
    void message() 
    { 
        System.out.println("This is class B"); 
    } 
  
    void display() 
    { 
        message(); 
  
        super.message(); 
    } 
} 
  
class Test 
{ 
    public static void main(String args[]) 
    { 
        Student s = new Student(); 

        s.display(); 
    } 
} 
