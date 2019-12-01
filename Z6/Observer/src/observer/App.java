/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class App {

    public static void main(String[] args) {
        TaxiBase taxiBase = new TaxiBaseImpl();

        taxiBase.addObserver(new TaxiPanel("T1"));

        taxiBase.addObserver(new TaxiPanel("T2"));

        taxiBase.notifyAllObserver("ulica kodPocztowy miasto");
    }

}
