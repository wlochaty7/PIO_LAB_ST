/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app6;

public class App {

    public static void main(String[] args) throws Exception {
        Counter c = Counter.instance;
        c.add();
        c.add();

        c = Counter.instance;
        c.add();
        c.add();
    }
}
