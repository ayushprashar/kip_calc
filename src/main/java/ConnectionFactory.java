/**
 * Made by Ayush Prashar
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  private static final String DB_URL = "jdbc:mysql://localhost:3306/kip";
  private static final String uName = "root";
  private static final String pwd = "root";

  private ConnectionFactory() {
    try {
      Class.forName(JDBC_DRIVER);

    } catch (ClassNotFoundException e) {

      e.printStackTrace();
    }
  }

  /**
   * accessing db.
   */
  public static Connection getconnection() {
    Connection cnn = null;

    try {
      System.out.println("Connection to Database !");

      cnn = DriverManager.getConnection(
          DB_URL, uName, pwd);


    } catch (SQLException e) {

      e.printStackTrace();
    }

    return cnn;
  }


}
