package com.string;

public class MemoryAllocDemo {
public static void main(String[] args) {
        
        String s1=new String("Akshay"); // 2 object
        
        String s2=new String("Akshay"); // 1 object
        
        String s3="Akshay"; // o object
        
        String s4="Akshay"; // o object
        
        System.out.println("s1: "+s1.hashCode());
        System.out.println("s2: "+s2.hashCode());
        System.out.println("s3: "+s3.hashCode());
        System.out.println("s4: "+s4.hashCode());
        
        System.out.println(s1.equals(s3)); // contains are same
        System.out.println("In Heap memory: "+s1==s3);
        
    }

}
