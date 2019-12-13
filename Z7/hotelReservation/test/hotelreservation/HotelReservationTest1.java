/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelreservation;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HotelReservationTest1 {

    private String firstName;
    private String lastName;
    private boolean expected;

    public HotelReservationTest1(String firstName, String lastName, boolean expected) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection validNameList() {
        return Arrays.asList(new Object[][]{{"", "", false}, {"a", "b", true}});
    }

    @Test
    public void isValidName_EmptyName_ReturnFalse() {
        HotelReservation reservation = new HotelReservation();
        boolean result = reservation.isValidName(firstName, lastName);

        assertEquals(expected, result);
    }
}



