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

/**
 *
 * @author syamcode
 */
public class TravelingTime {
    private List<TravelingTimeItem> travelingTimeItems = new ArrayList<TravelingTimeItem>(); 
    
    public void addTravelingTimes(TravelingTimeItem _travelingTimeItem) {
        travelingTimeItems.add(_travelingTimeItem);
    }
    
    public void printAllItem() {
        int i = 0;
        for(TravelingTimeItem item : travelingTimeItems) {
            System.out.println("Item " + ++i + ": ");
            System.out.println("Embarkation: " + item.getEmbarkation().getLocationName());
            System.out.println("Destination: " + item.getDestination().getLocationName());
            System.out.println("Transportation Mode: " + item.getTransportationMode().getTransportationName());
            System.out.println("Traveling Time: " + item.getTravelTime());
        }
    }
        
    public List<HashMap<TransportationMode, Date>> findTransportationMode(Location embarkation, Location destination, long travelTime, Date departure) {
        List<HashMap<TransportationMode, Date>> transportationMode = new ArrayList<HashMap<TransportationMode, Date>>();
        for(TravelingTimeItem item : travelingTimeItems) {
            if(item.getEmbarkation() == embarkation && item.getDestination() == destination && item.getTravelTime()<=travelTime) {
                HashMap<TransportationMode, Date> temp = new HashMap<TransportationMode, Date>();
                Date tDate = new Date(departure.getTime() - item.getTravelTime());
                temp.put(item.getTransportationMode(), tDate);
                transportationMode.add(temp);
            }
        }
        return transportationMode;
    }
}
