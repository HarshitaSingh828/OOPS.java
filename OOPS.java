import java.io.*;
import java.util.*;
public class Main{
    public static class Person{
        int age;
        String name;
        
        void sayhii(){
            System.out.println(age+name);
        }
    }
    public static void main(String[]args){
      Person p1 = new Person();
      p1.age = 10;
      p1.name = "A";
      
      p1.sayhii();
      
      Person p2 = new Person();
      p2.age = 20;
      p2.name = "B";
      p2.sayhii();
      
      Person p3 = p1;
      p3.age = 30;
      p3.sayhii();
      p1.sayhii();
   
        }
    
}

