package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final static String URL = "jdbc:mysql://localhost:3306/user_schema?useSSL=false";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";

   public static Connection getConnection() throws SQLException {
       try {
           System.out.println("создаю подключение");
           Class.forName(DRIVER);
           System.out.println("подключение ок");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return DriverManager.getConnection(URL, USERNAME, PASSWORD);
   }
}
