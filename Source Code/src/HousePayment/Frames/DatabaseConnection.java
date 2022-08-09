package HousePayment.Frames;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	String driver;
	String dbname;
	String connectionURL;
	String username;
	String password;
	
    public DatabaseConnection() {

    connectionURL = "jdbc:mysql://localhost:3306/";
    dbname = "userdb";
    username="root";
    password = "";
	
                            }
    static Connection C;
    public static Connection getConnection () throws Exception{
        if(C == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?zeroDateTimeBehavior=CONVERT_TO_NULL");
            System.out.println("SUCCESS");
        }
	
	return C;
    }
    
    
    public static void InsertData(String sql) throws Exception{
            getConnection().createStatement().executeUpdate(sql);
    }
    }



