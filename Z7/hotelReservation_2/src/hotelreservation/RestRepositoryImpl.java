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
public class RestRepositoryImpl implements RestRepository{

    @Override
    public boolean isPersonExists(String pesel) {
        RestServer rest = new RestServer();
        return rest.isPersonExists(pesel);
    }

    @Override
    public void addNewPerson(String pesel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePerson(String pesel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
