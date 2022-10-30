package Pr5.Pr5_Task1;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ScoreTable extends JFrame{
    private Integer countMilan = 0;
    private Integer countMadrid = 0;
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel label1 = new JLabel("Result: " + countMilan + " X " + countMadrid);
    private JLabel label2 = new JLabel("Last Scorer: N/A");
    private Label label = new Label("Winner: DRAW");

    private String getWinner(){
        if(countMadrid > countMilan) return "Real Madrid";
        else if(countMadrid < countMilan) return "AC milan";
        else return "DRAW";
    }

    public ScoreTable(){
        super("Score Table");
        this.setBounds(500, 500, 1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Container container = this.getContentPane();
        JPanel container = new JPanel();
        container.setLayout(new GridLayout(3, 2, 2, 2));

        ButtonGroup group1 = new ButtonGroup();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countMilan++;
                label1.setText("Result: " + countMilan + " X " + countMadrid);
                label2.setText("Last Scorer: AC Milan");
                label.setText("Winner: " + getWinner());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countMadrid++;
                label1.setText("Result: " + countMilan + " X " + countMadrid);
                label2.setText("Last Scorer: Real Madrid");
                label.setText("Winner: " + getWinner());
            }
        });
        container.add(button1);
        container.add(button2);
        container.add(label1);
        container.add(label2);
        container.add(label);
        this.getContentPane().add(container);
    }

}
