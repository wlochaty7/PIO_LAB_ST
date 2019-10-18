/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_simplefactory.p3;

import p2_simplefactory.Ticket;
import p2_simplefactory.TicketLot;
import p2_simplefactory.TicketLufthansa;

/**
 *
 * @author root
 */
public class SimpleFactory {

    public Ticket createTicket(String type) {

        if (type.equals("LOT")) {
            return new TicketLot();
        } else if (type.equals("Lufthansa")) {
            return new TicketLufthansa();
        } else {
            return new Ticket(type, 0);
        }
    }

}
