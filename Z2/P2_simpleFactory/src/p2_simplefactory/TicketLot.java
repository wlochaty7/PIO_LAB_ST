/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_simplefactory;

/**
 *
 * @author root
 */
public class TicketLot extends Ticket{
    
    public TicketLot() {
        super("LOT", 123.0);
    }
    
    @Override
    public void send(){}
    
}
