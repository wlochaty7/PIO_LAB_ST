/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app5;

public class Counter {

    private int count = 0;

    private Counter() {
        if (MyClass.instance != null) {
            throw new IllegalStateException("Error");
        }
    }

    public static Counter getInstance() {
        return MyClass.instance;
    }

    public void add() {
        this.count++;
        System.out.println(this.count);
    }

    private static class MyClass {

        private static final Counter instance = new Counter();
    }
}
