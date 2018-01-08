
import java.sql.*;

public class DbManagement {
  public void addToDB(int first, int second, String operand, int result) {
    Connection cnn = ConnectionFactory.getconnection();
    String query = "INSERT INTO calculator VALUES(?,?,?,?,?,?)";

    //    System.out.println("Connection bhi hai yar");
    PreparedStatement stmt = null;
    try {
      stmt = cnn.prepareStatement(query);

      stmt.setInt(1, 0);
      stmt.setDate(2, null);
      stmt.setInt(3, first);
      if (operand.equals("abs")) {
        stmt.setString(4, null);
      } else
        stmt.setInt(4, second);
      stmt.setString(5, operand);
      stmt.setInt(6, result);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void checkByID(int id) {
    String query = "SELECT LEFT_OPERAND,RIGHT_OPERAND,OPERATOR,RESULT FROM calculator where id = ?";
    Connection cnn = ConnectionFactory.getconnection();
    PreparedStatement stmt;
    try {
      stmt = cnn.prepareStatement(query);
      stmt.setInt(1, id);
      ResultSet rs = stmt.executeQuery();

      if (rs.next()) {
        int left = rs.getInt(1);
        int right = rs.getInt(2);
        String op = rs.getString(3);
        int result = rs.getInt(4);


        System.out.println("\nFirst operand " + left + " Second Operand " + right +
            " Operation " + op + " result " + result);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }


  }

  public void allCalcs(String operator) {
    String query = "\nSELECT LEFT_OPERAND,RIGHT_OPERAND,RESULT FROM calculator WHERE OPERATOR=?";
    Connection cnn = ConnectionFactory.getconnection();
    PreparedStatement stmt;
    try {
      stmt = cnn.prepareStatement(query);
      stmt.setString(1, operator);
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        int left = rs.getInt(1);
        int right = rs.getInt(2);
        int result = rs.getInt(3);

        System.out.println("\nFirst operand " + left + " Second Operand " + right +
            " Operation " + operator + " result " + result);

      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
