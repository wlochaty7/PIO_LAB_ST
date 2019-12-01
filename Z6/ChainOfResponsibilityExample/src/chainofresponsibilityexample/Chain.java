/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexample;

public interface Chain {

    public void setNext(Chain next);

    public String process(PlanetTypes type);
}
