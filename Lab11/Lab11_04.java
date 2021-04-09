package Lab11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab11_04 extends JFrame {
    private JButton plainBtn, fancyBtn;
    public Lab11_04 () {
        super("Program Using Image on Button");
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        
        ImageIcon plane1 = new ImageIcon("d:/airplane201.gif");
        ImageIcon plane2 = new ImageIcon("d:/airplane202.gif");
        // ImageIcon plane1 = new ImageIcon(
        // getClass().getResource("airplan201.gif") );
        // ImageIcon plane2 = new ImageIcon(
        // getClass().getResource("airplan202.gif") );
        fancyBtn = new JButton("Fancy Button",plane1);
       // fancyBtn.setRolloverIcon(plane1);
        c.add( fancyBtn );
        plainBtn = new JButton("Plain Button",plane2);
        plainBtn.setRolloverIcon(plane1);
        c.add( plainBtn );
        ButtonHandler handler = new ButtonHandler();
        fancyBtn.addActionListener( handler );
        plainBtn.addActionListener( handler );
    }
    private class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog( Lab11_04.this ,
        "You pressed : " + event.getActionCommand() );
    }
    }
    public static void main(String[] args) {
        Lab11_04 test = new Lab11_04();
        test.setSize(280, 200);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}