/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author j3s
 */
public class conexiondb {

    //MariaDB
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://127.0.0.1/sistema_medico";

    //MySQL
    //private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    //private static final String DB_CONNECTION = "jdbc:mysql://127.0.0.1/sistema_medico";

    private static final String DB_USER = "root";
//===
//    private static final String DB_PASSWORD = "123";
	private static final String DB_PASSWORD = "123";

    public static Connection getDBConnection() {

            Connection dbConnection = null;

            try {

                    Class.forName(DB_DRIVER);

            } catch (ClassNotFoundException e) {

                    System.out.println(e.getMessage());

            }

            try {

                    dbConnection = DriverManager.getConnection(
                            DB_CONNECTION, DB_USER,DB_PASSWORD);
                    return dbConnection;

            } catch (SQLException e) {

                    System.out.println(e.getMessage());

            }

            return dbConnection;

    }

}