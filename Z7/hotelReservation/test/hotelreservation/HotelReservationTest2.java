/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class HotelReservationTest2 {

    private HotelReservation reservation;

    public HotelReservationTest2() {
    }

    @Before
    public void init() {
        reservation = new HotelReservation();
    }

    @Test
    public void isValidName_EmptyName_ReturnFalse() {

        boolean result = reservation.isValidName("", "");

        assertFalse(result);
    }

    @After
    public void finish() {
        reservation = null;
    }

}
