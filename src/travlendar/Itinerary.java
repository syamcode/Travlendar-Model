/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travlendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import javafx.util.Pair;

/**
 *
 * @author syamcode
 */
public class Itinerary {
    private Location home;
    private List<ItineraryItem> itineraryItems= new ArrayList<ItineraryItem>();
    
    public void addItineraryItem(ItineraryItem item) {
        itineraryItems.add(item);
    }
    
    public Location getHome() {
        return home;
    }
    
    public void setHome(Location _home) {
        home = _home;
    }
    public void printAllItem() {
        int i = 0;
        for(ItineraryItem item : itineraryItems) {
            System.out.println("Item " + ++i + ": ");
            System.out.println("Itinerary Name: " + item.getItineraryItemName());
            System.out.println("Destination: " + item.getDestination().getLocationName());
            System.out.println("Start Time: " + item.getStartTime());
            System.out.println("End Time: " + item.getEndTime());
            System.out.println("Transportation Suggestion:");
            int j = 0;
            for(Pair<TransportationMode, Date> mode: item.getTransportationModeSuggestions()) {
                System.out.println((j+1) + ". " + mode.getKey().getTransportationName() + ", Berangkat : " + mode.getValue());
                j++;
            }
        }
    }
    
    public void suggestTransportationModes(TravelingTime travelingTime) {
        int i = 0;
        ItineraryItem item2 = new ItineraryItem("");
        for(ItineraryItem item : itineraryItems) {
            if(i==0) {
                item.setTransportationModes(travelingTime.findTransportationMode(home, item.getDestination(), 99, item.getStartTime()));
            }
            else {
                item.setTransportationModes(travelingTime.findTransportationMode(item2.getDestination(), item.getDestination(), (item.getStartTime().getTime() - item2.getEndTime().getTime())/(60000), item.getStartTime()));
                //System.out.println(item.getStartTime() + "-" + item2.getEndTime() + ":" + (item.getStartTime().getTime() - item2.getEndTime().getTime())/(6000));
            }
            item2 = item;
            i++;
        }
    }
}
