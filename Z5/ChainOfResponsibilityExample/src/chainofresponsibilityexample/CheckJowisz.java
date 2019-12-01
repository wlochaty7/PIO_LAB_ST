/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexample;

public class CheckJowisz implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }

    @Override
    public String process(PlanetTypes type) {
        if (type == PlanetTypes.JOWISZ) {
            return "Planeta Jowisz";
        } else {
            return this.next.process(type);
        }
    }
}
