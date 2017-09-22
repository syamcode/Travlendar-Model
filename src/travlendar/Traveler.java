/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travlendar;

/**
 *
 * @author syamcode
 */
public class Traveler {
    private String travelerName;
    private Itinerary travelerItinerary;
    
    public Traveler(String _travelerName) {
        travelerName = _travelerName;
    }
    
    public String getTravelerName() {
        return travelerName;
    }
    
    public void setTravelerName(String _travelerName) {
        travelerName = _travelerName;
    }
    
    public Itinerary getItinerary() {
        return travelerItinerary;
    }
    
    public void setItinerary(Itinerary _travelerItinerary) {
        travelerItinerary = _travelerItinerary;
    }
    
    public void printTravelerItinerary() {
        travelerItinerary.printAllItem();
    }
}
