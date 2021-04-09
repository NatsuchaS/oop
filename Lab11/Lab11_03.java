package Lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    public Lab11_03 () {
        super("Program Using Timer");
        swTimer = new Timer(1000, this);
        swTimer.start();
        JTextField inS;
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        c.add(new JLabel("Enter Shape[fillOval,fillRect,] : "));
        inS = new JTextField(10);
        inS.addActionListener(this);
        c.add(inS);
    }
    public void paint(Graphics g) {
        super.paint(g);
        int x = 20 + (int) (Math.random() * 450);
        int y = 20 + (int) (Math.random() * 270);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue) );
        g.drawOval( x, y, 20, 20);
    }
    public void actionPerformed(ActionEvent event) {
        repaint();
    }
    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(480, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}