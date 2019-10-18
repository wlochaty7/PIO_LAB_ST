/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_simplefactory.p1;

import p2_simplefactory.Ticket;

/**
 *
 * @author root
 */
public class App {
    
    public Ticket buyTicket()
    {
        Ticket ticket = new Ticket("",0);
        ticket.setReservation();
        ticket.send();
        
        return ticket;
    }
}
