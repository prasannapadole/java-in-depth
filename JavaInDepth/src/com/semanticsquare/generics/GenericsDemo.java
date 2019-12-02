package com.semanticsquare.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		Container<String> stringStore = new Store<>();
		stringStore.set("Java");
		System.out.println(stringStore.get());
		
		Container<Integer> integerStore = new Store<>();
		integerStore.set(10);
		System.out.println(integerStore.get());
		
		Container<List<Integer>> listStore = new Store<>();
		/*List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		listStore.set(list);*/
		listStore.set(Arrays.asList(10,20,30,40));
		System.out.println(listStore.get().toString());
		
	}

}

interface Container<T> {
	void set(T a);
	T get();
}

class Store<T> implements Container<T> {
	private T a;
	
	public void set(T a) {
		this.a = a;
	}
	
	public T get() {
		return a;
	}
}
