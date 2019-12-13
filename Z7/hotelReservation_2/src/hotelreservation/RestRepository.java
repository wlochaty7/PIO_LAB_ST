/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

/**
 *
 * @author root
 */
public interface RestRepository {
    public boolean isPersonExists(String pesel);
    public void addNewPerson(String pesel);
    public void removePerson(String pesel);
}
