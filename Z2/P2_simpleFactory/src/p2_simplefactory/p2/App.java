/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_simplefactory.p2;

import p2_simplefactory.Ticket;
import p2_simplefactory.TicketLot;
import p2_simplefactory.TicketLufthansa;

/**
 *
 * @author root
 */
public class App {

    // metoda nie jest zamknięta na modyfikacje - zostaje naruszona zasada Open/closed principle 
    //(klasa powinna być otwarta na rozszerzenie, ale zamknięta na modyfikacje)
    
    //z racji operatora new mamy bezpośrednią zależność między klasą App, a Ticket
    public Ticket buyTicket(String type) {
        Ticket ticket;

        if (type.equals("LOT")) {
            ticket = new TicketLot();
        } else if (type.equals("Lufthansa")) {
            ticket = new TicketLufthansa();
        } else {
            ticket = new Ticket(type, 0);
        }
        ticket.setReservation();
        ticket.send();
        
        return ticket;
    }
}
