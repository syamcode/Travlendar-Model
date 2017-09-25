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
import javafx.util.Pair;

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
        
    public List<Pair<TransportationMode, Date>> findTransportationMode(Location embarkation, Location destination, long travelTime, Date departure) {
        List<Pair<TransportationMode, Date>> transportationMode = new ArrayList<Pair<TransportationMode, Date>>();
        for(TravelingTimeItem item : travelingTimeItems) {
            if(item.getEmbarkation() == embarkation && item.getDestination() == destination && item.getTravelTime()<=travelTime) {
                Date tDate = new Date(departure.getTime() - (item.getTravelTime()*60000));
                transportationMode.add(new Pair<TransportationMode, Date>(item.getTransportationMode(), tDate));
            }
        }
        return transportationMode;
    }
}
