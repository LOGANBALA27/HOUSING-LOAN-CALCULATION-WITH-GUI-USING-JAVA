package HousePayment.Frames;
import HousePayment.Frames.DatabaseConnection;
import javax.swing.JOptionPane;
import static HousePayment.HousePayment.*;


public class SaveData {
    public static void SaveToDB(){
        try{
        DatabaseConnection.InsertData("INSERT INTO Customer(CustId,ICno,FName,LName,Address,State,HType,Property,DownPay,AmountFin,InterRate,LPeriod,MonthlyAmt)"
        +"VALUES('"+one.getText()+"','"+two.getText()+"','"+three.getText()+"','"+four.getText()+"','"+five.getText()+"','"+States.getSelectedItem()+"','"+HouseType.getSelectedItem()+"','"+eight.getText()+"','"+nine.getText()+"','"+ten.getText()+"','"+eleven.getText()+"','"+twelve.getText()+"','"+thirteen.getText()+"')");
        
      
        
        JOptionPane.showMessageDialog(null, "Database was successfully updated");
               
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
