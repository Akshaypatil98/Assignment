package com.array;

public class ThirdLargest {
	public static int third(int[]a,int total) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];
	}
	public static void main(String[] args) {
		int[] a= {5,10,8,13,25};
		System.out.println("third largest="+third(a, 5));
	}

}
