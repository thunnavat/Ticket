/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import base.Station;

/**
 *
 * @author allal
 */
public class StationData {
    
    public static Station[] getStation() {
        Station[] stations = new Station[11];
        stations[0] = new Station("Ratchadamri");
        stations[1] = new Station("Sala Daeng");
        stations[2] = new Station("Chong Nonsi");
        stations[3] = new Station("Surasak");
        stations[4] = new Station("Saphan Taksin");
        stations[5] = new Station("Krung Thon Buri");
        stations[6] = new Station("Wongwian Yai");
        stations[7] = new Station("Pho Nimit");
        stations[8] = new Station("Talat Phlu");
        stations[9] = new Station("Wutthakat");
        stations[10] = new Station("Bang Wa");
        
        
       return stations; 
    }
    
}
