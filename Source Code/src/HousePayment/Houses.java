package HousePayment;
public class Houses {
    
    private String type1 = "Bungalow";
    private String type2 = "Condominium";
    private String type3 = "DoubleStorey";
    private String type4 = "Terrace";

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getType3() {
        return type3;
    }

    public void setType3(String type3) {
        this.type3 = type3;
    }

    public String getType4() {
        return type4;
    }

    public void setType4(String type4) {
        this.type4 = type4;
    }
    
    
    public void doSomething(int a, int b, double c, int d)
    {
        a = d * a/100;
        int finamount = d - a;
        
        c = c/100;
            
        double MIR = c/12;
        
        int MT = b * 12;
        
       double FINAL = finamount * MIR /(1-1/Math.pow((1+MIR), MT));
       
        String DownPayment= String.valueOf(a);
         String hello= String.valueOf(c);
          String what= String.valueOf(finamount);
          String where= String.format("%.5f",MIR);
          String Moterm= String.valueOf(MT);
          String FINALE= String.format("%.2f",FINAL);
    }
}

