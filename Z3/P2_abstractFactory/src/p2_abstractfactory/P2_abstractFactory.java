/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_abstractfactory;


public class P2_abstractFactory {

    public static void main(String[] args) {
        createComputer(new StandardComputerFactory());
        createComputer(new ServerComputerFactory());
    }
    
    private static void createComputer(ComputerElementsFactory cef)
    {
        Disc disc = cef.buyDisc();
        disc.createDisc();
        
        Memory memory = cef.buyMemory();
        memory.createMemory();
        
        Procesor procesor = cef.buyProcesor();
        procesor.createProcesor();
    }
    
}
