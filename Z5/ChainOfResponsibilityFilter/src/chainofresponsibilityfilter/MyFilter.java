/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityfilter;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class MyFilter extends JFrame {

    private DefaultListModel taskListModel;

    public MyFilter() {
        super("Filtr elementów adresu");

        this.taskListModel = new DefaultListModel();

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new Header(this.taskListModel), BorderLayout.NORTH);
        c.add(new PrimaryPanel(this.taskListModel), BorderLayout.CENTER);

        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
