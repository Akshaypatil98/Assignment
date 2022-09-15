package com.object;

public class Box1 {
	double h,w,d;

	public Box1(double h, double w, double d) {
		super();
		this.h = h;
		this.w = w;
		this.d = d;
	}
	double volume() {
		double v;
		return v=h*w*d;
		
	}
	public static void main(String[] args) {
		Box1 b=new Box1(5,10,15);
		System.out.println(b.volume());
	}

}
