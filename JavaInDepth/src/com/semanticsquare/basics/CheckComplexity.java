package com.semanticsquare.basics;

public class CheckComplexity{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		UsingArray.display();
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Time Elapsed (Using Arrays):"+timeElapsed);
		
		startTime = System.currentTimeMillis();
		UsingClass.display();
		endTime = System.currentTimeMillis();
		timeElapsed = endTime - startTime;
		System.out.println("Time Elapsed (Using Class):"+timeElapsed);
	}
}

class UsingArray{
		static void display(){
			int[][] revenueWithYear = {
				{1994,1995,1996,1997,1998},
				{200,250,183,210,300}
			};
			for(int i=0; i<revenueWithYear.length; i++){
				for(int j=0; j<revenueWithYear[i].length; j++){
					System.out.print(revenueWithYear[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
}

class UsingClass{
	static void display(){
		Revenue[] r = new Revenue[5];
	
		r[0].year = 1994;
		r[0].rev = 200; 
		r[1].year = 1995;
		r[1].rev = 250;
		r[2].year = 1996;
		r[2].rev = 183;
		r[3].year = 1997;
		r[3].rev = 210;
		r[4].year = 1998;
		r[4].rev = 300;
		
		for(int j=0; j<r.length; j++){
			System.out.println(r[j].year+"\t");
			System.out.print(r[j].rev);
		}
	}
	
}

class Revenue{
	int year;
	int rev;
}