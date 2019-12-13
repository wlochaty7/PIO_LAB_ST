/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

import java.util.ArrayList;

public class MockRestRepository implements RestRepository {

    private ArrayList<String> list;

    public MockRestRepository() {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean isPersonExists(String pesel) {
        for (String p : list) {
            if (p.equals(pesel)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewPerson(String pesel) {
        this.list.add(pesel);
    }

    @Override
    public void removePerson(String pesel) {
        this.list.remove(pesel);
    }

}
