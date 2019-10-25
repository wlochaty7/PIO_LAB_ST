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
public class ServerProcesor implements Procesor{

    @Override
    public void createProcesor() {
        System.out.println("Serwerowy procesor");
    }
    
}
