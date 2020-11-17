/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author allal
 */
public class Station {
    private final String stationName;
    
    public Station(String stationName) {
    this.stationName = stationName;
}
    
    @Override
    public String toString() {
        return "Station Name: " + stationName;
    }
    
}
