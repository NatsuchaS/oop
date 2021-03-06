import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab8_3 extends JFrame implements ActionListener {
    JLabel textLabel;
    JTextField textField;
    JButton saveBtn, clearBtn, showBtn;
    JButton addBtn, subBtn, mulBtn, divBtn,sqrtBtn,percent,PMBtn,toHex,power;
    Container container;
    NumberNew obj;

public Lab8_3()
{
    super("Program Calculate Number");
    container = getContentPane();
    container.setLayout( new FlowLayout() );
        
    textLabel = new JLabel("Enter number :");
    textLabel.setFont(new Font("Courier New",Font.BOLD,20));
    container.add( textLabel );

    textField = new JTextField( 10 );
    textField.setFont(new Font("Courier New",Font.BOLD,24));
    container.add( textField );

    saveBtn = new JButton(" Save ");
    saveBtn.setFont(new Font("Courier New",Font.BOLD,20));
    saveBtn.addActionListener( this);
    container.add( saveBtn );

    clearBtn = new JButton(" Clear ");
    clearBtn.setFont(new Font("Courier New",Font.BOLD,20));
    clearBtn.addActionListener( this);
    container.add( clearBtn );

    showBtn = new JButton(" Show ");
    showBtn.setFont(new Font("Courier New",Font.BOLD,20));
    showBtn.addActionListener( this);
    container.add( showBtn );

    addBtn = new JButton(" + ");
    addBtn.setFont(new Font("Courier New",Font.BOLD,20));
    addBtn.addActionListener( this);
    container.add( addBtn );

    subBtn = new JButton(" - ");
    subBtn.setFont(new Font("Courier New",Font.BOLD,20));
    subBtn.addActionListener( this);
    container.add( subBtn );

    mulBtn = new JButton(" * ");
    mulBtn.setFont(new Font("Courier New",Font.BOLD,20));
    mulBtn.addActionListener( this);
    container.add( mulBtn );

    divBtn = new JButton(" / ");
    divBtn.setFont(new Font("Courier New",Font.BOLD,20));
    divBtn.addActionListener( this);
    container.add( divBtn );
    
    
    sqrtBtn = new JButton(" sqrt ");
    sqrtBtn.setFont(new Font("Courier New",Font.BOLD,20));
    sqrtBtn.addActionListener( this);
    container.add( sqrtBtn );

    percent= new JButton(" % ");
    percent.setFont(new Font("Courier New",Font.BOLD,20));
    percent.addActionListener( this);
    container.add(  percent );

    PMBtn= new JButton(" +/- ");
    PMBtn.setFont(new Font("Courier New",Font.BOLD,20));
    PMBtn.addActionListener( this);
    container.add(   PMBtn  );

    toHex= new JButton(" 10 -> 16 ");
    toHex.setFont(new Font("Courier New",Font.BOLD,20));
    toHex.addActionListener( this);
    container.add(   toHex  );

    power= new JButton(" 10^x ");
    power.setFont(new Font("Courier New",Font.BOLD,20));
    power.addActionListener( this);
    container.add(   power  );

    setSize(400,250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
public static void main(String[] args) {
    Lab8_3 test = new Lab8_3();
    // create obj of class NumberNew
    test.obj = new NumberNew();
    test.textField.setText(test.obj.toString());
}

public void actionPerformed( ActionEvent event ) {
    if (event.getSource() == saveBtn) {
        if (textField.getText().isEmpty()){}
        else{
        double value =    Double.parseDouble(textField.getText());
        obj.setValue(value);
        textField.setText("");}
    }
    else if (event.getSource() == clearBtn) {                                                                                                                                       
        obj.setValue( 0 );
        textField.setText("");
    }
    else if (event.getSource() == showBtn) {

        textField.setText(obj.toString());
    }
    else if (event.getSource() == addBtn) {
        if (textField.getText().isEmpty()){}
            else{
        double value =   Double.parseDouble(textField.getText());
        obj.add(value);
        textField.setText(obj.toString());}
    }
    else if (event.getSource() == subBtn) {
        if (textField.getText().isEmpty()){}
            else{
        double value =   Double.parseDouble(textField.getText());
        obj.subtract(value);
        textField.setText(obj.toString());}
    }
    else if (event.getSource() == mulBtn) {
        
        if (textField.getText().isEmpty()){}
        else{
        double value =   Double.parseDouble(textField.getText());
        obj.multiply(value);
        textField.setText(obj.toString());}
    }
    else if (event.getSource() == divBtn) {
        if (textField.getText().isEmpty()){}
        else{
        double value =   Double.parseDouble(textField.getText());
        obj.divide(value);
        textField.setText(obj.toString());}}
            
    else if (event.getSource() == PMBtn) {
        if (textField.getText().isEmpty()){}
            else{
        double value = Double.parseDouble(textField.getText());
        obj.divPM(value);
        textField.setText(obj.toString());}}
    else if (event.getSource() == sqrtBtn) {
        if (textField.getText().isEmpty()){}
            else{
        double value = Double.parseDouble(textField.getText());
        obj.divsqrt(value);
        textField.setText(obj.toString());}}
    else if (event.getSource() == percent) {
        if (textField.getText().isEmpty()){}
        else{
        double value = Double.parseDouble(textField.getText());
        obj.divper(value);
        textField.setText(obj.toString());}}
    else if (event.getSource() == toHex) {
        if (textField.getText().isEmpty()){}
        else{
            double value = Double.parseDouble(textField.getText());
            textField.setText(obj.divHex(value));}}
    else if (event.getSource() == power) {
        if (textField.getText().isEmpty()){}
        else{
        double value = Double.parseDouble(textField.getText());
        obj.divpower(value);
        textField.setText(obj.toString());}}            



        
        
        


}
    }