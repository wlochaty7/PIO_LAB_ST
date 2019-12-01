/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.app3;

import java.lang.reflect.Constructor;

public class App {

    public static void main(String[] args) throws Exception {
        beforeRefactoring();
        
        afterRefactoring();
    }
    
    private static void beforeRefactoring()throws Exception
    {
        Counter1 c = Counter1.getInstance();
        c.add();
        c.add();

        Constructor<Counter1> constructor = Counter1.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        c = constructor.newInstance();
        c.add();
        c.add();
    }
    
    private static void afterRefactoring()throws Exception
    {
        Counter2 c = Counter2.getInstance();
        c.add();
        c.add();

        Constructor<Counter2> constructor = Counter2.class.getDeclaredConstructor();

        constructor.setAccessible(true);

        c = constructor.newInstance();
        c.add();
        c.add();
    }

}
