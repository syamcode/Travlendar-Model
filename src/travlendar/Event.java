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
public class Event {
    private String eventName;
    private Date endTime = new Date();
    private Date startTime = new Date();
    private Location destination;
    private List<Suggestion> suggestions = new ArrayList<Suggestion>();
    
    public Event(String _eventName) {
        eventName = _eventName;
    } 
    public String getEventName() {
        return eventName;
    }
    
    public void setEventName(String _eventName) {
        eventName = _eventName;
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
    
    public List<Suggestion> getSuggestions() {
        return suggestions;
    }
    
    public void setSuggestions(List<Suggestion> _suggestions) {
        suggestions = _suggestions;
    }
}
