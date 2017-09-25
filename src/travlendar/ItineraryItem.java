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
public class ItineraryItem {
    private String itineraryItemName;
    private Date endTime = new Date();
    private Date startTime = new Date();
    private Location destination;
    private List<HashMap<TransportationMode, Date>> transportationModeSuggestions = new ArrayList<HashMap<TransportationMode, Date>>();
    
    public ItineraryItem(String _itineraryItemName) {
        itineraryItemName = _itineraryItemName;
    } 
    public String getItineraryItemName() {
        return itineraryItemName;
    }
    
    public void setItineraryItemName(String _itineraryItemName) {
        itineraryItemName = _itineraryItemName;
    }
    
    public Date getEndTime() {
        return endTime;
    }
    
    public void setEndTime(Date _endTime) {
        endTime = _endTime;
    }
    
    public Date getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Date _startTime) {
        startTime = _startTime;
    }
    
    public Location getDestination() {
        return destination;
    }
    
    public void setDestination(Location _destination) {
        destination = _destination;
    }
    
    public List<HashMap<TransportationMode, Date>> getTransportationModeSuggestions() {
        return transportationModeSuggestions;
    }
    
    public void setTransportationModes(List<HashMap<TransportationMode, Date>> _transportationModeSuggestions) {
        transportationModeSuggestions = _transportationModeSuggestions;
    }
}
