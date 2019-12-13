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
public class HotelReservation {
    
    public boolean isValidName(String firstName,String lastName)
    {
        if(firstName.isEmpty() || lastName.isEmpty())
        {
            return false;
        }
        return true;
    }
    
    public boolean isValidAge(int age)throws Exception
    {
        if(age<18)
        {
            throw new Exception("osoba niepełnoletnia");
        }
        return true;
    }
}
