/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinebookingsystem;

/**
 *
 * @author christopher
 */
/**
 *
 * @author corey
 */
public class Flight {
    
    //variables
    public int flightID;
    public String airline;
    public String Destination;
    public String Departure;
    public String DepartTime;
    public String ArrivalTime;
    public String Duration;
    public int NoSeats;
    public String Type;

    // constructor
    public Flight(int flightID, String airline, String Destination, String Departure, String DepartTime, String ArrivalTime, String Duration, int NoSeats, String Type) {
        this.flightID = flightID;
        this.airline = airline;
        this.Destination = Destination;
        this.Departure = Departure;
        this.DepartTime = DepartTime;
        this.ArrivalTime = ArrivalTime;
        this.Duration = Duration;
        this.NoSeats = NoSeats;
        this.Type = Type;
    }

    // create getters and setters 
    public int getFlightID() {
        return flightID;
    }

    public String getAirline() {
        return airline;
    }

    public String getDestination() {
        return Destination;
    }

    public String getDeparture() {
        return Departure;
    }

    public String getDepartTime() {
        return DepartTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public String getDuration() {
        return Duration;
    }

    public int getNoSeats() {
        return NoSeats;
    }

    public String getType() {
        return Type;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public void setDeparture(String Departure) {
        this.Departure = Departure;
    }

    public void setDepartTime(String DepartTime) {
        this.DepartTime = DepartTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public void setNoSeats(int NoSeats) {
        this.NoSeats = NoSeats;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Flight{" + "flightID=" + flightID + ", airline=" + airline + ", Destination=" + Destination + ", Departure=" + Departure + ", DepartTime=" + DepartTime + ", ArrivalTime=" + ArrivalTime + ", Duration=" + Duration + ", NoSeats=" + NoSeats + ", Type=" + Type + '}';
    }
    
    
    
    
}