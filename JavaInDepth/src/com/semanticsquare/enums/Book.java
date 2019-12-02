package com.semanticsquare.enums;

public class Book {
	public enum BookGenre {
		BIOGRAPHY(12),
		HORROR(14);
		
		private BookGenre(int minAgeToRead) {
			this.minAgeToRead = minAgeToRead;
		}
		
		private int minAgeToRead;
		
		public int getMinAgeToRead() {
			return minAgeToRead;
		}
	}
	
	public static void main(String[] args) {    
		for (BookGenre bookGenre : BookGenre.values()) {
            System.out.print("\nName: " + bookGenre); //toString
            System.out.print(", name(): " + bookGenre.name());
            System.out.print(", Ordinal: " + bookGenre.ordinal());
            System.out.print(", Declaring Class: " + bookGenre.getDeclaringClass());	
            System.out.print(", compareTo(HORROR): " + bookGenre.compareTo(BookGenre.HORROR));
            System.out.print(", equals(HORROR): " + bookGenre.equals(BookGenre.HORROR));
            System.out.println(", minAgeToRead : " + bookGenre.getMinAgeToRead());
         }        
    }
}
