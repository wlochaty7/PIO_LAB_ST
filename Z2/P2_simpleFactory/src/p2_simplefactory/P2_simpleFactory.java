package p2_simplefactory;

import p2_simplefactory.p3.SimpleFactory;

public class P2_simpleFactory {

    public static void main(String[] args) {
        p2_simplefactory.p3.App app = new p2_simplefactory.p3.App(new SimpleFactory());
        Ticket ticket = app.buyTicket("LOT");

        System.out.println(ticket.getName());
        System.out.println(ticket.getPrice());

    }

}
