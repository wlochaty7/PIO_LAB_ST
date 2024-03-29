/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app4;


public class Counter {

    private static volatile Counter instance;
    private int count = 0;

    private Counter() {
        if (instance != null) {
            throw new IllegalStateException("Error");
        }
    }

    public static Counter getInstance() {
        if (instance == null) {
            synchronized (Counter.class) {
                if (instance == null) {
                    instance = new Counter();
                }
            }
        }
        return instance;
    }

    public void add() {
        this.count++;
        System.out.println(this.count);
    }
}
