package mysql.labs;

import java.sql.*;

public class JDBC_Example_1 {
    public static void main(String[] args)  {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

             /* Other examples include:
                 Class.forname("oracle.jdbc.driver.oracledriver");
                 Class.forName("org.postgresql.Driver");
                 Class.forName("mongodb.jdbc.mongodriver"); */


            // configure the "connection string" (below) with the following format
            // -------------------------------------
            // jdbc:/mysql://H.O.S.T:<PORT>/DATABASE
            // -------------------------------------
            // on our localhost we don't need the port ":3306", we will also
            // add the login credentials and one or more other arguments
            // within the connection String. Your username here is most
            // likely "root", unless you have already created
            // new database users. The default MySQL username is "root".


            // NOTE: depending on your version of MySQL, you may need to delete "&useSSL=false"
            // from the connection String below in order to connect to the database


            String connectionString = "jdbc:mysql://localhost/university?"
                    + "user=root&password=punqyp-nevxy8-zyVqap"
                    + "&allowPublicKeyRetrieval=true";


            // Example connection String to remote MySQL instance:
            // "jdbc:mysql://178.34.21.99:3306/codingnomads?user=root&password=3tr0ngP@33W0rd"


            // Setup the connection with the DB
            connection = DriverManager.getConnection(connectionString);

            resultSet = statement.executeQuery("select * from university.courses;");

            System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

            System.out.println("The columns in the table are: ");
            for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
                System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
            }



        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
