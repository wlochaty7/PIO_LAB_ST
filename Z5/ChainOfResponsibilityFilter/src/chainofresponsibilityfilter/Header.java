/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityfilter;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author root
 */
public class Header extends JPanel implements ActionListener {

    private JButton addNewTaskButton;

    private JTextField content;

    private DefaultListModel taskListModel;

    public Header(DefaultListModel taskListModel) {
        this.taskListModel = taskListModel;

        this.setLayout(new GridLayout(1, 1));
        this.add(createControlPanel());
    }

    private JPanel createControlPanel() {
        this.content = new JTextField(15);
        this.addNewTaskButton = new JButton("Dodaj nowy");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(content);
        panel.add(addNewTaskButton);

        this.addNewTaskButton.addActionListener(this);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object target = e.getSource();

        if (target == this.addNewTaskButton) {
            taskListModel.addElement(this.content.getText());
            this.content.setText("");
        }
    }
}
