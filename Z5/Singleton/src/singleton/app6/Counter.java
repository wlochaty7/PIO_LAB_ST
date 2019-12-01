/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app6;

public enum Counter {
    instance;

    private int count = 0;

    public void add() {
        this.count++;
        System.out.println(this.count);
    }
}
