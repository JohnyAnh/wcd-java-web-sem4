package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;

        try {
            //Đăng ký MySQl Driver với DriverManager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //Các thông số
            String url = "jdbc:mySQL://localhost:3306/JavaWebLearn_liststudent";
            String username = "root";
            String password = "";

            //Tạo kê nối
            c = DriverManager.getConnection(url, username, password);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }
    public  static  void  closeConnection(Connection c){
        try {
            if (c!=null){
                c.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static  void printInfo(Connection c){
        try {
            if (c!=null){
                DatabaseMetaData mtdt = c.getMetaData();
                System.out.println(mtdt.getDatabaseProductName());
                System.out.println(mtdt.getDatabaseProductVersion());
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
