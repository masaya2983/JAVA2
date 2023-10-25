import java.sql.*;

public class Main{
  public static void main(String[] args) throws Exception{
    Class.forName("org.h2.Driver");
    String dburl = "jdbc:h2:～/test";
    Connection conn = DriverManager.getConnection(dburl);
    conn.createStatement().executeUPdate(sql);
    conn.close();
  }
}