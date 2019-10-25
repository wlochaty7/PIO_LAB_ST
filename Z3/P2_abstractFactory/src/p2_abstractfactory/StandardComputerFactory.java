/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_abstractfactory;


public class StandardComputerFactory implements  ComputerElementsFactory{

    @Override
    public Memory buyMemory() {
        return new StandardMemory();
    }

    @Override
    public Procesor buyProcesor() {
        return new StandardProcesor();
    }

    @Override
    public Disc buyDisc() {
        return new StandardDisc();
    }
    
}
