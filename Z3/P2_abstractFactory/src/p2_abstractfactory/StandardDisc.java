/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_abstractfactory;

/**
 *
 * @author root
 */
public class StandardDisc implements Disc{

    @Override
    public void createDisc() {
        System.out.println("Standardowy dysk");
    }
    
}
