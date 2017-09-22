/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travlendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author syamcode
 */
public class Travlendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Traveler Hisyam = new Traveler("Hisyam");
        Itinerary itinerary = new Itinerary();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        
        ItineraryItem item1 = new ItineraryItem("Olahraga Pagi");
        Location embarkation1 = new Location("Ciwaruga");
        Location destination1 = new Location("Polban");
        Date startTime1 = dateFormat.parse("2017-09-20 05:00:00");
        Date endTime1 = dateFormat.parse("2017-09-20 06:00:00");
        item1.setEmbarkation(embarkation1);
        item1.setDestination(destination1);
        item1.setEndTime(endTime1);
        item1.setStartTime(startTime1);
        itinerary.addItineraryItem(item1);
        
        ItineraryItem item2 = new ItineraryItem("Sarapan");
        Location embarkation2 = new Location("Polban");
        Location destination2 = new Location("Sarijadi");
        Date startTime2 = dateFormat.parse("2017-09-20 06:30:00");
        Date endTime2 = dateFormat.parse("2017-09-20 07:30:00");
        item2.setEmbarkation(embarkation2);
        item2.setDestination(destination2);
        item2.setEndTime(endTime2);
        item2.setStartTime(startTime2);
        itinerary.addItineraryItem(item2);
        
        
        Hisyam.setItinerary(itinerary);
        Hisyam.printTravelerItinerary();
        
        TransportationMode motor = new TransportationMode("Motor");
        TransportationMode mobil = new TransportationMode("Mobil");
        TransportationMode sepeda = new TransportationMode("Sepeda");
        TransportationMode jalanKaki = new TransportationMode("Jalan Kaki");
        TransportationMode Delman = new TransportationMode("Delman");
        
        TravelingTime travelingTime = new TravelingTime();
        
        TravelingTimeItem travelingTimeItem1 = new TravelingTimeItem();
        travelingTimeItem1.setEmbarkation(embarkation1); //Ciwaruga
        travelingTimeItem1.setDestination(destination1); //Polban
        travelingTimeItem1.setTransportationMode(jalanKaki);
        travelingTimeItem1.setTravelTime(30);
        
        travelingTime.addTravelingTimes(travelingTimeItem1);
        
        TravelingTimeItem travelingTimeItem2 = new TravelingTimeItem();
        travelingTimeItem2.setEmbarkation(embarkation1); //Ciwaruga
        travelingTimeItem2.setDestination(destination1); //Polban
        travelingTimeItem2.setTransportationMode(motor);
        travelingTimeItem2.setTravelTime(15);
        
        travelingTime.addTravelingTimes(travelingTimeItem2);
        
        TravelingTimeItem travelingTimeItem3 = new TravelingTimeItem();
        travelingTimeItem3.setEmbarkation(embarkation1); //Ciwaruga
        travelingTimeItem3.setDestination(destination1); //Polban
        travelingTimeItem3.setTransportationMode(mobil);
        travelingTimeItem3.setTravelTime(20);
        
        travelingTime.addTravelingTimes(travelingTimeItem3);
        
        TravelingTimeItem travelingTimeItem4 = new TravelingTimeItem();
        travelingTimeItem4.setEmbarkation(embarkation2); //Polban
        travelingTimeItem4.setDestination(destination2); //Sarijadi
        travelingTimeItem4.setTransportationMode(jalanKaki);
        travelingTimeItem4.setTravelTime(30);
        
        travelingTime.addTravelingTimes(travelingTimeItem4);
        
        TravelingTimeItem travelingTimeItem5 = new TravelingTimeItem();
        travelingTimeItem5.setEmbarkation(embarkation2); //Ciwaruga
        travelingTimeItem5.setDestination(destination2); //Sarijadi
        travelingTimeItem5.setTransportationMode(motor);
        travelingTimeItem5.setTravelTime(15);
        
        travelingTime.addTravelingTimes(travelingTimeItem5);
        
        TravelingTimeItem travelingTimeItem6 = new TravelingTimeItem();
        travelingTimeItem6.setEmbarkation(embarkation2); //Ciwaruga
        travelingTimeItem6.setDestination(destination2); //Sarijadi
        travelingTimeItem6.setTransportationMode(mobil);
        travelingTimeItem6.setTravelTime(20);
        
        travelingTime.addTravelingTimes(travelingTimeItem6);
        
        
        // TODO code application logic here
    }
    
}