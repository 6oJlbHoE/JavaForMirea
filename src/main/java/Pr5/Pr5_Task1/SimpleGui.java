package Pr5.Pr5_Task1;

import org.w3c.dom.css.CSSImportRule;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleGui extends JFrame{
    private JButton button = new JButton("Press");
    private TextField input = new TextField("", 5);
    private JLabel label = new JLabel("Input: ");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGui(){
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected\n";
            message += "Checkbox is " + (check.isSelected() ? "checked" : "uncheked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
