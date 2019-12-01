/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityfilter;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;


public class PrimaryPanel extends JScrollPane {

    public PrimaryPanel(DefaultListModel taskListModel) {
        super(new JList(taskListModel));
    }

}
