/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

public class HotelReservation3 {

    private RestRepository repository;

    public HotelReservation3() {
        this.repository = Factory.createRepository();
    }

    public boolean isPersonExists(String pesel) {
        return repository.isPersonExists(pesel);
    }
}
