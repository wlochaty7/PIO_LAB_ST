/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_abstractfactory;


public interface ComputerElementsFactory {
    Memory buyMemory();
    Procesor buyProcesor();
    Disc buyDisc();
}
