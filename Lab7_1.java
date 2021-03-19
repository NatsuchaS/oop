import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab7_1 extends JFrame{
    JLabel numberLabel, resultLabel,numberLabe2;
    JTextField numberField1,numberField2;
    JTextArea resultArea;
    JScrollPane scrol;
    public Lab7_1() {
        super("Program display value n");
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );
        numberLabel = new JLabel("Enter integer and press Enter");
        container.add( numberLabel );
        numberField1 = new JTextField( 10 );
        container.add( numberField1 );
        numberLabe2 = new JLabel("Enter blank and press Enter ");
        container.add( numberLabe2 );
        numberField2 = new JTextField( 10 );
        container.add( numberField2 );
       
        numberField1.addActionListener(
        new ActionListener() {
                public void actionPerformed( ActionEvent event ){
                    int number, sp;
                    String blank = "";
                    if(!numberField2.getText().isEmpty()){
                        sp=Integer.parseInt( numberField2.getText() );
                        for(int n=1;n <= sp; n++) blank+=" ";
                    }
                    number = Integer.parseInt( numberField1.getText() );
                    resultArea.setText("");
                    for (int n = 1 ; n <= number ; n++) {
                        resultArea.append( blank + Integer.toString(n));
                        if (n % 5 == 0) resultArea.append("\n");}
                    numberField1.setText("");
                    
        } 
    }
);

numberField2.addActionListener(
        new ActionListener() {
                public void actionPerformed( ActionEvent event ){
                    int number, sp;
                    String blank = "";
                    if(!numberField2.getText().isEmpty()){
                        sp=Integer.parseInt( numberField2.getText() );
                        for(int n=1;n <= sp; n++) blank+=" ";
                    }
                    number = Integer.parseInt( numberField1.getText() );
                    resultArea.setText("");
                    for (int n = 1 ; n <= number ; n++) {
                        resultArea.append( blank + Integer.toString(n));
                        if (n % 5 == 0) resultArea.append("\n");}
                    numberField1.setText("");
                    
        } 
    }
);
resultArea = new JTextArea( 10,20 );
resultArea.setEditable( false );
scrol = new JScrollPane(resultArea);
container.add( scrol );
}
public static void main(String[] args) {
    Lab7_1 window = new Lab7_1();
    window.setSize( 360,240);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    }
    }