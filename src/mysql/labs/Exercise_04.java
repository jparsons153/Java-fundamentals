package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

import java.sql.*;

public class Exercise_04 {

    public static void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...); - done
        queryFlight(...); - done
        updateFlight(...); 
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);
        ...

         */

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/university?"
                    + "user=root&password= ******"  // insert password
                    + "&allowPublicKeyRetrieval=true";

            connection = DriverManager.getConnection(connectionString);

            // call methods here within try / catch block
            createFlight(connection, preparedStatement);

            queryFlights(connection,statement, resultSet);

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

    private static void createFlight(Connection connection, PreparedStatement preparedStatement) throws SQLException{

            preparedStatement = connection.prepareStatement
                    ("Insert into airtravel database(flightindex,Flight_no,departure_time,arrival_time,Airport_depart, Airport_arrive,NumPassengers, PlaneID))" + "values (?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, 18);
            preparedStatement.setString(2, "BA314");
            preparedStatement.setTime(3, 10:15:00, 2022 - 03 - 21); // date Time method?
            preparedStatement.setTime(4, 12:15:00, 2022 - 03 - 21); // date Time method?
            preparedStatement.setString(5, "LHR");
            preparedStatement.setString(6, "MUN");
            preparedStatement.setInt(7, 399);
            preparedStatement.setInt(8, 101);
            preparedStatement.executeUpdate();
    }

    private static void queryFlights(Connection connection, Statement statement, ResultSet resultSet) throws SQLException{

        statement = connection.createStatement();

        resultSet = statement.executeQuery("select * from airtravel.flights;");

        while(resultSet.next()){
            System.out.println(resultSet.getInt("flightindex"));
            System.out.println(resultSet.getString("Flight_no"));
            System.out.println(resultSet.getTime("departure_time"));
            System.out.println(resultSet.getTime("arrival_time"));
            System.out.println(resultSet.getString("Airport_depart"));
            System.out.println(resultSet.getString("Airport_arrive"));
            System.out.println(resultSet.getInt("NumPassengers"));
            System.out.println(resultSet.getInt("PlaneID"));
        }
    }
}
