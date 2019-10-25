/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_abstractfactory;


public class ServerComputerFactory implements  ComputerElementsFactory{

    @Override
    public Memory buyMemory() {
        return new ServerMemory();
    }

    @Override
    public Procesor buyProcesor() {
        return new ServerProcesor();
    }

    @Override
    public Disc buyDisc() {
        return new ServerDisc();
    }
    
}
