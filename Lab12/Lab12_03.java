package Lab12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab12_03 extends JFrame implements ActionListener,MouseListener {
    int x1, y1, x2,y2;
    //JButton btnLine, btnRect, btnCircle, btnClear;
    JTextField text1, text2;
    Color oldColor1, oldColor2;
    char typeShape = 'L';
    boolean isDraw = true;
    
    public Lab12_03() {
        super("");
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        // btnLine = new JButton("Line");
        // btnLine.addActionListener( this );
        // c.add(btnLine);
        // btnRect = new JButton("Rectangle");
        // btnRect.addActionListener( this );
        // c.add(btnRect);
        // btnCircle = new JButton("Circle");
        // btnCircle.addActionListener( this );
        // c.add(btnCircle);
        // btnClear = new JButton("Clear");
        // btnClear.addActionListener( this );
        // c.add(btnClear);
        text1 = new JTextField(12);
        text1.setEditable( false );
        c.add( text1 );
        text2 = new JTextField(12);
        text2.setEditable( false );
        c.add( text2 );
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor( Color.BLACK );
        g.drawRect( 50, 32, 71, 26);
        g.setColor(Color.YELLOW);
        g.fillRect( 51, 33, 70 , 25);
        g.setColor( Color.RED );
        g.drawString("Line", 75, 50 );

        g.setColor( Color.BLACK );
        g.drawRect( 130, 32, 71, 26);
        g.setColor(Color.YELLOW);
        g.fillRect( 131, 33, 70 , 25);
        g.setColor( Color.RED );
        g.drawString("Rectangle", 140, 50 );

        g.setColor( Color.BLACK );
        g.drawRect( 210, 32, 71, 26);
        g.setColor(Color.YELLOW);
        g.fillRect( 211, 33, 70 , 25);
        g.setColor( Color.RED );
        g.drawString("Circle", 230, 50 );

        g.setColor( Color.BLACK );
        g.drawRect( 290, 32, 71, 26);
        g.setColor(Color.YELLOW);
        g.fillRect( 291, 33, 70 , 25);
        g.setColor( Color.RED );
        g.drawString("Clear", 310, 50 );

        g.setColor( Color.BLACK );
        g.drawRect( 40, 65, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect( 41, 66, 30 , 30);

        g.setColor( Color.BLACK );
        g.drawRect( 40, 65, 30, 30);
        g.setColor(Color.BLACK);
        g.fillRect( 41, 66, 30 , 30);

        
        
        
        switch (typeShape) {
        case 'L' :
            g.drawLine(x1, y1, x2, y2);
            break;
        case 'R' :
            g.drawRect(x1, y1, x2-x1, y2-y1);
            break;
        case 'C' :
            g.drawOval(x1, y1, x2-x1, y2-y1);
            break;
        }
    }
    public void mousePressed(MouseEvent event) {
        if (event.getButton() == 1) { // Mouse Left
            x1 = event.getX();
            y1 = event.getY();
            text1.setText("(X1 = "+x1+",Y1 = "+y1+")" );
        }else if (event.getButton() == 3) { // Mouse Right
            x2 = event.getX();
            y2 = event.getY();
            text2.setText(" (X2 = "+x2+",Y2 = "+y2+")" );

            
    }

    public void mouseReleased(MouseEvent event) { }

    public void mouseClicked(MouseEvent event) {
        boolean flag = isInside(50, 32, 61, 26,event.getX(),event.getY());
        if (isDraw == true) {
            if (flag == true) {
                System.out.println("Lab12_01.mouseClicked()");
            }
    }
        
        repaint();
    }

    public void mouseEntered( MouseEvent event ) {
        repaint();
    }

    public void mouseExited(MouseEvent event) {
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        // if (e.getSource() == btnLine) typeShape = 'L';
        // else if (e.getSource() == btnRect) typeShape = 'R';
        // else if (e.getSource() == btnCircle) typeShape = 'C';
        // else if (e.getSource() == btnClear) {
        //     x1 = y1 = x2 = y2 = 0;
        //     text1.setText("");
        //     text2.setText("");
        //     }
        //     repaint();
            }

    boolean isInside(int x1,int y1,int size,int posx,int posy) {
    int x2 = x1 + size;
    int y2 = y1 + size;
    if (posx >= x1 && posx <= x2)
    if (posy >= y1 && posy <= y2) return true;
    return false;
    }
    public static void main(String[] args) {
        Lab12_03 window = new Lab12_03();
        window.setSize(400, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        }
    }