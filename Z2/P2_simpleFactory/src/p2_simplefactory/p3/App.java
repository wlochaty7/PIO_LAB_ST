/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_simplefactory.p3;

import p2_simplefactory.Ticket;

/**
 *
 * @author root
 */
public class App {

    private SimpleFactory factory;

    public App(SimpleFactory factory) {
        this.factory = factory;
    }

    public Ticket buyTicket(String type) {
        Ticket ticket = factory.createTicket(type);

        ticket.setReservation();
        ticket.send();
        
        return ticket;
    }
}
