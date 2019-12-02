package com.semanticsquare.collections.treeSet_and_comparator_exercise;

import java.util.Comparator;

public class PubDateAscComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		
		if(b1.getYear() < b2.getYear()) {
			return -1;
		}
		else if(b1.getYear() == b2.getYear()) {
			return b1.getTitle().compareTo(b2.getTitle());
		}
		else {
			return 1;
		}
	}

}
