/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class TaxiPanel implements Observer {

    private String id;

    public TaxiPanel(String id) {
        this.id = id;
    }

    @Override
    public void update(String address) {
        System.out.println("Nowy adres [" + address + "] dla taksówki nr " + id);
    }

    public String getId() {
        return id;
    }
}
