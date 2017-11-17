/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev_ops;

/**
 *
 * @author corey
 */
public class Airport {
    
    //variables
    public int AirportID;
    public String AirportName;
    public String location;
    
    //constructor

    public Airport(int AirportID, String AirportName, String location) {
        this.AirportID = AirportID;
        this.AirportName = AirportName;
        this.location = location;
    }
        
    //getters and setters

    public int getAirportID() {
        return AirportID;
    }

    public String getAirportName() {
        return AirportName;
    }

    public String getLocation() {
        return location;
    }

    public void setAirportID(int AirportID) {
        this.AirportID = AirportID;
    }

    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Airport{" + "AirportID=" + AirportID + ", AirportName=" + AirportName + ", location=" + location + '}';
    }
    
}

