import java.math.BigInteger;
public class NumberNew {
    private double number;
    public NumberNew() {
        setValue((int) (Math.random() * 100));
    }
    public NumberNew(double n) {
        setValue( n );
    }
    public void setValue(double n){
        number = n;
    }
    public double getValue(){
        return(number);
    }
    public String toString(){
        return(Double.toString(getValue()));
    }
    public void add(double n) {
        setValue( getValue() + n);
    }
    public void subtract(double n) {
        setValue( getValue() - n);
    }
    public void multiply(double n) {
        setValue( getValue() * n);
    }
    public void divide(double n) {
        setValue( getValue() / n);
    }public void divPM(double n) {
        if( n <0){
            setValue( Math.abs(n));
        }else{
            setValue( n-n-n);
        }}
    public void divsqrt(double n) {
            setValue(Math.sqrt(n));
    }
    public void divper(double n) {
        setValue(n*100/getValue());
    }
    public String divHex(double n) {
        setValue(n);
        int value = (int)(n);
        return ( Integer.toHexString(value));
    }
    public void divpower(double n) {
        setValue(Math.pow(10, n));
    }
    }
    

        
      
    
    