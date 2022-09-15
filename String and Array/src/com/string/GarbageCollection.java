package com.string;

public class GarbageCollection {
	String str;



	   public GarbageCollection(String str) {
	        super();
	        this.str = str;
	    }



	   @Override
	    protected void finalize() throws Throwable {
	       
	        super.finalize();
	        System.out.println("Garbage collection");
	    }



	   public static void main(String[] args) {



	       GarbageCollection gc = new GarbageCollection("Akshay");
	        gc = null;
	        System.gc();



	   }
}
