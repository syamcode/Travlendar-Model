/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travlendar;

import java.util.ArrayList;
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
    
    public List<TransportationMode> findTransportationMode(Location embarkation, Location destination) {
        List<TransportationMode> transportationMode = new ArrayList<TransportationMode>();
        for(TravelingTimeItem item : travelingTimeItems) {
            if(item.getEmbarkation() == embarkation && item.getDestination() == destination) {
                transportationMode.add(item.getTransportationMode());
            }
        }
        return transportationMode;
    }
}
