package com.semanticsquare.basics;

public class Basic {
	static void go(int[] arr){
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		arr[0] = 2;
	}
	static void go(int i){
		System.out.println("go(int i)");		
	}
	static void go(short s){
		System.out.println("go(short s)");
	}
	static void varargsOverload(boolean b, int i, int j, int k){
		System.out.println("Inside varargsOverload without varargs:");
	}
	static void varargsOverload(boolean b, int... list){
		System.out.println("Inside varargsOverload with varargs:");
		System.out.println("list.length:"+list.length);
	}
	public static void main(String[] args){
		//int[] array = {1,2};
		//go(array);
		//System.out.println("array[0]:"+array[0]);
		//System.out.println("array[1]:"+array[1]);
		
		//go(1000);
		//byte b = 22L;
		//go(b);
		varargsOverload(true, 1, 2, 3);
		varargsOverload(true, 1, 2, 3, 4, 5, 6, 7);
		varargsOverload(true);
	}
}