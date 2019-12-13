/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

public class HotelReservation2 {

    private RestRepository repository;

    public RestRepository getRepository() {
        return repository;
    }

    public void setRepository(RestRepository repository) {
        this.repository = repository;
    }

    public boolean isPersonExists(String pesel) {
        return repository.isPersonExists(pesel);
    }
}
