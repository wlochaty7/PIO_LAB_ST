/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app1;

public class Counter {

    private static final Counter instance = new Counter();
    private int count = 0;

    private Counter() {
    }

    public static Counter getInstance() {
        return instance;
    }

    public void add() {
        this.count++;
        System.out.println(this.count);
    }
}
