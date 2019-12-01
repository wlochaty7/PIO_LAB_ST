/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app3;

/**
 *
 * @author root
 */
public class Counter1 {

    private static Counter1 instance;
    private int count=0;

    private Counter1() {
    }

    public static Counter1 getInstance() {
        if(instance == null){
            instance = new Counter1();
        }
        return instance;
    }
    
    public void add()
    {
        this.count++;
        System.out.println(this.count);
    }
}
