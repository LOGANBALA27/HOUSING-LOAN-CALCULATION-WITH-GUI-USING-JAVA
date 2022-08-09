package HousePayment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Customer {
    
    //DATA MEMBERS OF CUSTOMER
    
    private String CustomerID;
    private String FName;
    private String LName;
    private String Address;
    private String Postcode;
    private String ICNo;
    private double Deposit;
    private double DownPayment; 
    private JFrame frame;
    //GETTER AND SETTER
    
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getICNo() {
        return ICNo;
    }

    public void setICNo(String ICNo) {
        this.ICNo = ICNo;
    }

    public double getDeposit() {
        return Deposit;
    }

    public void setDeposit(double Deposit) {
        this.Deposit = Deposit;
    }

    public double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(double DownPayment) {
        this.DownPayment = DownPayment;
    }
    
    public void ExitSystem(){
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "House Payment Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }
    
}
