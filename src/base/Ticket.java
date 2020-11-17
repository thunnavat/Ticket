/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import data.StationData;

/**
 *
 * @author allal
 */
public class Ticket {
    private final StationData origin;
    private final StationData destination;
    
    public Ticket(StationData origin, StationData destination) {
        this.origin = origin;
        this.destination = destination;
    
    }
}

