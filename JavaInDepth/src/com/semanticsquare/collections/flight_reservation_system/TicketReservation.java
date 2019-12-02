package com.semanticsquare.collections.flight_reservation_system;

import java.util.ArrayDeque;
import java.util.ArrayList; 
import java.util.Deque; 
import java.util.Iterator; 
import java.util.List;

public class TicketReservation {

    private static final int CONFIRMEDLIST_LIMIT = 10;
    private static final int WAITINGLIST_LIMIT = 3;

    private List<Passenger> confirmedList = new ArrayList<>();
    private Deque<Passenger> waitingList = new ArrayDeque<>();

    // This getter is used only by the junit test case. 
    public List<Passenger> getConfirmedList() {
        return confirmedList;     
    }

    /**      
     * Returns true if passenger could be added into either confirmedList or      
     * waitingList. Passenger will be added to waitingList only if confirmedList      
     * is full.      
     *      
     * Return false if both passengerList & waitingList are full      
     */     
     public boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass, String confirmationNumber) {
		
    	 Passenger passenger = new Passenger(firstName, lastName, age, gender, travelClass, confirmationNumber);
    	 if(confirmedList.size() <= 10) {
    		 confirmedList.add(passenger);
    		 return true;
    	 } else if(waitingList.size() <=3) {
    		 waitingList.add(passenger);
    		 return true;
    	 }
    	 
    	 return false;       
    }

    /**      
     * Removes passenger with the given confirmationNumber. Passenger could be      
     * in either confirmedList or waitingList. The implementation to remove the      
     * passenger should go in removePassenger() method and removePassenger method      
     * will be tested separately by the uploaded test scripts.      
     
     * If passenger is in confirmedList, then after removing that passenger, the      
     * passenger at the front of waitingList (if not empty) must be moved into      
     * passengerList. Use poll() method (not remove()) to extract the passenger      
     * from waitingList.      
     */     
    public boolean cancel(String confirmationNumber) {
    	Iterator<Passenger> iterator = confirmedList.iterator();
    	boolean isRemoved = removePassenger(iterator, confirmationNumber);
    	
		return isRemoved;
    }

    /**      
     * Removes passenger with the given confirmation number.      
     * Returns true only if passenger was present and removed. Otherwise, return false.      
     */     
    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {
    	while(iterator.hasNext()) {
    		if(iterator.next().getConfirmationNumber().equals(confirmationNumber)) {
    			iterator.remove();
    			Passenger passenger = waitingList.poll();
    			if(passenger != null) {
    				confirmedList.add(passenger);
    			}
    			return true;
    		} else {
    			iterator = waitingList.iterator();
    			while(iterator.hasNext()) {
    				if(iterator.next().getConfirmationNumber().equals(confirmationNumber)) {
    	    			iterator.remove();
    	    			return true;
    				}
    			}
    		}
    	}
    	
    	return false;         
    }
    
    public static void main(String[] args) {
    	System.out.println("There mu");
    }

}
