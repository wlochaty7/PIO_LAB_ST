/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

public class HotelReservation {

    private RestRepository repository;

    public HotelReservation(RestRepository repository) {
        this.repository = repository;
    }

    public void addNewPerson(String pesel) {
        if (!repository.isPersonExists(pesel)) {
            this.repository.addNewPerson(pesel);
        }

    }

    public void removePerson(String pesel) {
        if (repository.isPersonExists(pesel)) {
            this.repository.removePerson(pesel);
        }
    }
}
