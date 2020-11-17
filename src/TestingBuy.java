
import base.Station;
import static data.StationData.getStation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allal
 */
public class TestingBuy {
    public static void main(String[] args) {
        printStation();

    
}
    
    
        private static void printStation() {
        Station[] stations = getStation();
        for (int i = 0; i < stations.length; i++) {
            System.out.println(stations[i].toString());
        }
        }
}