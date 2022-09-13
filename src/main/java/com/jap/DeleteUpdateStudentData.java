package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pw = "admin";
        connection = DriverManager.getConnection(url, user, pw);
        return connection;

    }

    public void deleteStudentData() throws SQLException, ClassNotFoundException {
      // call getConnection() method
        Statement st = getConnection().createStatement();
        //execute delete query
        String sql = "Delete from student where Rollnumber = 14";
        st.executeUpdate(sql);
        System.err.println("Deletion Success");

    }

    public void updateStudentData() throws SQLException, ClassNotFoundException {
        // call getConnection() method
        Statement st = getConnection().createStatement();
        //execute update query
        String sql = "update student set age = 30 where totalmarks = 678 and Rollnumber = 15";
        st.executeUpdate(sql);
        System.err.println("updation success");
    }

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        try {
            salesDataDemo.deleteStudentData();
            salesDataDemo.updateStudentData();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
