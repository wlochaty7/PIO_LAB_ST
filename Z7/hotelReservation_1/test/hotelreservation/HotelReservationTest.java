/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class HotelReservationTest {
    
    public HotelReservationTest() {
    }
    
    @Test
    public void isPersonExists_PersonExists_ReturnTrue1() {
        HotelReservation1 reservation = new HotelReservation1(new AlwaysExistsPersonFakeRestRepository());
        
        boolean result = reservation.isPersonExists("abc");
        
        assertTrue(result);
    }
    
    @Test
    public void isPersonExists_PersonExists_ReturnTrue2() {
        HotelReservation2 reservation = new HotelReservation2();
        reservation.setRepository(new AlwaysExistsPersonFakeRestRepository());
        boolean result = reservation.isPersonExists("abc");
        
        assertTrue(result);
    }
    
    @Test
    public void isPersonExists_PersonExists_ReturnTrue3() {
        Factory.setRepository(new AlwaysExistsPersonFakeRestRepository());
        
        HotelReservation3 reservation = new HotelReservation3();

        boolean result = reservation.isPersonExists("abc");
        
        assertTrue(result);
    }
    
}
