/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexample;

public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        Chain jowisz = new CheckJowisz();
        Chain mars = new CheckMars();
        Chain wenus = new CheckWenus();
        Chain merkury = new CheckMerkury();

        jowisz.setNext(mars);
        mars.setNext(wenus);
        wenus.setNext(merkury);

        System.out.println(jowisz.process(PlanetTypes.MARS));
        System.out.println(jowisz.process(PlanetTypes.JOWISZ));

    }

}
