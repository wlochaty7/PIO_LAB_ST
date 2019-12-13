/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

public class Factory {

    private static RestRepository restRepository;

    public static void setRepository(RestRepository repository) {
        restRepository = repository;
    }

    public static RestRepository createRepository() {
        return restRepository;
    }
}
