package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection(){
        Connection connection=null;

        return connection;

    }

    public void deleteStudentData(){
      // call getConnection() method
       
        //execute delete query
    }

    public void updateStudentData(){
        // call getConnection() method

        //execute update query
    }

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
    }
}
