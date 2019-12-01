/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexample;

/**
 *
 * @author root
 */
public class CheckMerkury implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }

    @Override
    public String process(PlanetTypes type) {
        if (type == PlanetTypes.MERKURY) {
            return "Planeta Merkury";
        } else {
            return this.next.process(type);
        }
    }
}
