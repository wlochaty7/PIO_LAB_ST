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
public class HotelReservationTest3 {
    
    public HotelReservationTest3() {
    }

    @Test
    public void isValidName_EmptyName_ReturnFalse() {
        HotelReservation reservation= createHotelReservation();
        
        boolean result = reservation.isValidName("", "");
        
        assertFalse(result);
    }
    
    @Test(expected = Exception.class)
    public void isValidAge_Children_ThrowsException()throws Exception {
        HotelReservation reservation= createHotelReservation();
        
        reservation.isValidAge(6);
        
    }
    
    private HotelReservation createHotelReservation()
    {
        return new HotelReservation();
    }
    
}
