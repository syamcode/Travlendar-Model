/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travlendar;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author syamcode
 */
public class Itinerary {
    private List<ItineraryItem> itineraryItems= new ArrayList<ItineraryItem>();
    
    public void addItineraryItem(ItineraryItem item) {
        itineraryItems.add(item);
    }
    
    public void printAllItem() {
        int i = 0;
        for(ItineraryItem item : itineraryItems) {
            System.out.println("Item " + ++i + ": ");
            System.out.println("Itinerary Name: " + item.getItineraryItemName());
            System.out.println("Embarkation: " + item.getEmbarkation().getLocationName());
            System.out.println("Destination: " + item.getDestination().getLocationName());
            System.out.println("Start Time: " + item.getStartTime());
            System.out.println("End Time: " + item.getEndTime());
        }
    }
    
    public void suggestTransportationModes(TravelingTime travelingTime) {
        ListIterator<ItineraryItem> itr = itineraryItems.listIterator(itineraryItems.size());
        while(itr.hasPrevious()) {
            ItineraryItem item = itr.previous();
            item.setTransportationModes(travelingTime.findTransportationMode(item.getEmbarkation(), item.getDestination()));
            
        }
    }
}
