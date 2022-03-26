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
import java.time.*;

public class Exercise_04 {

    public static void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...); - done
        queryFlight(...); - done
        updateFlight(...); - done
        deleteFlight(...); - done

        createPassenger(...); - done
        queryPassenger(...); - done
        updatePassenger(...); - done
        deletePassenger(...); - done
        ...

         */

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connectionString = "jdbc:mysql://localhost/airtravel?"
                    + "user=root&password= ******"  // insert password
                    + "&allowPublicKeyRetrieval=true";

            connection = DriverManager.getConnection(connectionString);

            // call methods here within try / catch block
            createFlight(connection, preparedStatement);

            queryFlights(connection, statement, resultSet);

            updateFlight(connection, preparedStatement);

            deleteFlight(connection, preparedStatement);

            createPassenger(connection, preparedStatement);

            queryPassenger(connection, statement, resultSet);

            updatePassenger(connection, preparedStatement);

            deletePassenger(connection, preparedStatement);

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

    private static void createFlight(Connection connection, PreparedStatement preparedStatement) throws SQLException {

        preparedStatement = connection.prepareStatement
                ("Insert into airtravel.flights database(flightindex,Flight_no,departure_time,arrival_time,Airport_depart, Airport_arrive,NumPassengers, PlaneID))" + "values (?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, 18);
        preparedStatement.setString(2, "BA314");
        preparedStatement.setTimestamp(3, java.sql.Timestamp.valueOf("2022-03-21 10:15:00"));
        preparedStatement.setTimestamp(4, java.sql.Timestamp.valueOf("2022-03-21 12:15:00"));
        preparedStatement.setString(5, "LHR");
        preparedStatement.setString(6, "MUN");
        preparedStatement.setInt(7, 399);
        preparedStatement.setInt(8, 101);
        preparedStatement.executeUpdate();
    }

    private static void queryFlights(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        statement = connection.createStatement();

        resultSet = statement.executeQuery("select * from airtravel.flights;");

        while (resultSet.next()) {
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

    private static void updateFlight(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement = connection.
                prepareStatement("update airtravel.flights set airport = ? where airport depart = ?");
        preparedStatement.setString(5, "LGW");
        int x = preparedStatement.executeUpdate();
        System.out.println(x);
    }

    private static void deleteFlight(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement = connection.
                prepareStatement("delete from airtravel.flights where flight Index = ?");
        preparedStatement.setInt(1, 15);
        System.out.println(preparedStatement.executeUpdate());
    }

    private static void createPassenger(Connection connection, PreparedStatement preparedStatement) throws SQLException {

        preparedStatement = connection.prepareStatement
                ("Insert into airtravel.passengers database(Booking_ref, First_name, Last_name, Date_of_birth, Address, Passengers, Flight_details, Meal_preference))" + "values (?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, 110110);
        preparedStatement.setString(2, "Jill");
        preparedStatement.setString(3, "Bloggs");
        preparedStatement.setDate(4, java.sql.Date.valueOf("1953-09-01"));
        preparedStatement.setString(5, "10 Northumberland Street");
        preparedStatement.setInt(6, 1);
        preparedStatement.setString(8, "N/A");
        preparedStatement.executeUpdate();
    }

    private static void queryPassenger(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        statement = connection.createStatement();

        resultSet = statement.executeQuery("select * from airtravel.passengers;");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("Booking_ref"));
            System.out.println(resultSet.getString("First_name"));
            System.out.println(resultSet.getString("Last_name"));
            System.out.println(resultSet.getDate("Date_of_birth"));
            System.out.println(resultSet.getString("Address"));
            System.out.println(resultSet.getInt("Passengers"));
            System.out.println(resultSet.getString("Flight_details"));
            System.out.println(resultSet.getString("Meal_preference"));
        }
    }

    private static void updatePassenger(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement = connection.
                prepareStatement("update airtravel.passenger set First Name = ? where Last Name = ?");
        preparedStatement.setString(2, "Kate");
        System.out.println(preparedStatement.executeUpdate());
    }

    private static void deletePassenger(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement = connection.
                prepareStatement("delete from airtravel.passenger where Last Name = ?");
        preparedStatement.setString(3, "Norris");
        System.out.println(preparedStatement.executeUpdate());
    }

}
