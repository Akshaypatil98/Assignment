package com.array;

import java.util.Arrays;

public class SortNumberUnitPlaces {
	 public static void main(String[] args) {
	        
	        int num[]= {23,45,65,78,10,56,43,33};
	        
	            for(int i=0;i<num.length;i++) {
	            
	            for(int j=i+1;j<num.length;j++) {
	            if(num[i]%10>num[j]%10) {
	                int temp=num[i];
	                num[i]=num[j];
	                num[j]=temp;
	            }
	            }
	        }
	        for(int s:num) {
	            System.out.println(s);
	        }
	    }
	


}
