/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

import org.junit.Test;
import static org.junit.Assert.*;



public class HotelReservationTest {
    
    public HotelReservationTest() {
    }

    @Test
    public void isValidName_EmptyName_ReturnFalse() {
        HotelReservation reservation= new HotelReservation();
        
        boolean result = reservation.isValidName("", "");
        
        assertFalse(result);
    }
    
}
