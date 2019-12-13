/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

import org.junit.Test;
import static org.junit.Assert.*;

public class HotelReservationTest {

    @Test
    public void isPersonExists_PersonExists_ReturnTrue1() {
        MockRestRepository mock = new MockRestRepository();
        HotelReservation reservation = new HotelReservation(mock);

        boolean result = mock.isPersonExists("abc");
        assertFalse(result);

        reservation.addNewPerson("abc");
        result = mock.isPersonExists("abc");
        assertTrue(result);

        reservation.removePerson("abc");
        result = mock.isPersonExists("abc");
        assertFalse(result);

    }
}
