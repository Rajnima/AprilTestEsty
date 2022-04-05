package com.java;

public class variables {
	int i=10; //instance variable
	static int j=15; //static or class variable

	public int Add(int a, int b) { //local variable
	
		int sum = a+b;
		System.out.println("sum"+sum);
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Inside main method");
   variables obj= new variables();
  obj.Add(5,8);
	}

}
