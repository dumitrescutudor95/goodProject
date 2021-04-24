import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Diavola;
import model.FreeSample;
import model.Pizza;
import model.QuattroFromaggi;
import model.QuattroStagioni;

public class POS {

  private static Check check;
  private static DatabaseConnection database = new DatabaseConnection();

  public static void generateCheck() {
    check = new Check();
    System.out.println("The check was generated.");
  }

  public static void addProduct(Pizza pizza) {

    if(database.isProductAvailable(pizza.getName())){
      if(pizza.isFreeSample()){
        database.removeProductFromDatabase(pizza.getName());
        //System.out.println("Free samples should not be included in the check.");
      } else{
        check.addProduct(pizza.getName(), pizza.getPrice());
      }
    }
  }



  public static void printCheck() {

      check.printCheck();
      for (String produs : check.getSoldProducts()) {
        database.removeProductFromDatabase(produs);
      }
    cancelCheck();
  }

  public static void cancelCheck() {
    check = new Check();
    System.out.println("The check was canceled.");
  }

  public static Check getCheck() {
    return check;
  }

  public DatabaseConnection getDatabase() {
    return database;
  }

  public void setDatabase(DatabaseConnection database) {
    this.database = database;
  }
}
