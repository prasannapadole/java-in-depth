package com.semanticsquare.collections.treeSet_and_comparator_exercise;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static Set<Book> treeSetDemo(Comparator<Book> comparator) {
		Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book2 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book3 = new Book("Walden", "Henry David Thoreau", 1854);
		Book book4 = new Book("Effective Java", "Joshua Bloch", 2008);
		Book book5 = new Book("The Last Lecture", "Randy Pausch", 2008);
			  
		Set<Book> books = null;
		if (comparator == null) {
			books = new TreeSet<>();
		} else {
			books = new TreeSet<>(comparator);
		}
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
	      
	    for (Book book : books) {
	    	System.out.println(book);
	    }
	    
	    return books;
	}
	
	public static void main(String[] args) {
		//hashSetDemo();
		treeSetDemo(new Book.PubDateComparators.PubDateAscComparator());
	}	
}



/*import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	private static void hashSetDemo() {
		Set<String> set1 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("a");
						
		System.out.println("set1: " +  set1);
		
		Book book1 = new Book("Walden", "Henry Thoreau", 1854);
		Book book2 = new Book("Walden", "Henry Thoreau", 1854);
		Set<Book> set2 = new HashSet<>();
		set2.add(book1);
		set2.add(book2);
		System.out.println("set2: " +  set2);
	}
	
	public static Set<Book> treeSetDemo(Comparator<Book> comparator) {
		Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book2 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book3 = new Book("Walden", "Henry David Thoreau", 1854);
		Book book4 = new Book("Effective Java", "Joshua Bloch", 2008);
		Book book5 = new Book("The Last Lecture", "Randy Pausch", 2008);
			
		Set<Book> books = new TreeSet<>();
		if(comparator != null) {
			books = new TreeSet<>(comparator);
		}
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
	      
	    for (Book book : books) {
	    	System.out.println(book);
	    }		
	    
	    return books;
	}
	
	public static void main(String[] args) {
		//hashSetDemo();
		treeSetDemo(new PubDateDescComparator());
	}	
	
}
*/