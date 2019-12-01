/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app3;

public class Counter2 {

    private static Counter2 instance;
    private int count = 0;

    private Counter2() {
        if (instance != null) {
            throw new IllegalStateException("Error");
        }
    }

    public static Counter2 getInstance() {
        if (instance == null) {
            instance = new Counter2();
        }
        return instance;
    }

    public void add() {
        this.count++;
        System.out.println(this.count);
    }
}
