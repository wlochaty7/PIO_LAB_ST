/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app2;

public class App {

    public static void main(String[] args) {
        Counter c = Counter.getInstance();
        c.add();
        c.add();
        
        c = Counter.getInstance();
        c.add();
        c.add();
    }
    
}
