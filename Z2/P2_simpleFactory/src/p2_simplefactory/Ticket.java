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
public class Ticket {

    private double price;
    private String name;
    private boolean reservation;

    public Ticket(String name, double price) {
        this.name = name;
        this.price = price;
        this.reservation = false;
    }

    public void send() {
    }

    public boolean isReservation() {
        return reservation;
    }

    public void setReservation() {
        this.reservation = true;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
