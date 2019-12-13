/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

public class AlwaysExistsPersonFakeRestRepository implements RestRepository {

    @Override
    public boolean isPersonExists(String pesel) {
        return true;
    }

}
