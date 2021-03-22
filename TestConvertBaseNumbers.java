public class TestConvertBaseNumbers {
    static String bin,hex,dec;
    public static void main(String [] args){
     ConvertBaseNumbers covert = new ConvertBaseNumbers();
     
     //input dec
     String numberDecimal = "23119";
     System.out.println("Input Decimal Number : "+numberDecimal);
     //dec
     bin = covert.decTobin(numberDecimal);
     System.out.println("decTobin : "+bin);
     hex = covert.decTohex(numberDecimal);
     System.out.println("decTohex : "+hex);
     
     //bin
     dec = covert.binToDec(bin);
     System.out.println("binToDec : "+dec);
     hex = covert.binTohex(bin);
     System.out.println("binTohex : "+hex);
     
     //hex
     bin = covert.hexTobin(hex);
     System.out.println("hexTobin : "+bin);
     dec = covert.hexToDec(hex);
     System.out.println("hexToDec : "+dec);
   
    }
   }