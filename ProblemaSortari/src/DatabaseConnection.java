import java.sql.*;

public class DatabaseConnection {

    public DatabaseConnection(){};

    public static void removeProductFromDatabase(String product) {
        try {
            Connection connection = DriverManager
                    .getConnection("http://dummyUrl:dummyPort/dummyDatabaseName");
            Statement countStatement = connection.createStatement();
            ResultSet rs = countStatement
                    .executeQuery("SELECT quantity FROM pizzas WHERE product = '" + product + "'");
            rs.next();
            int remainingQuantity = rs.getInt("quantity") - 1;

            Statement updateStatement = connection
                    .createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            updateStatement.executeUpdate(
                    "ALTER TABLE pizzas SET quantity='" + remainingQuantity + "' WHERE product=" + product);
        }catch(SQLException e){
            //For testing purposes, there will be no error.the product will be removed
        }
    }

    public static boolean isProductAvailable(String product) {
        try {
            Connection connection = DriverManager
                    .getConnection("http://dummyUrl:dummyPort/dummyDatabaseName");
            Statement statement = connection
                    .createStatement();
            ResultSet result = statement
                    .executeQuery("SELECT quantity FROM pizzas WHERE product = '" + product + "'");
            return result.getInt("quantity") > 0;
        } catch (SQLException e) {
            return true;       //For testing purposes, there will be no error.the product will be in stock
        }
    }
}
