package staff;


public class Cook implements ActionCook {

  @Override
  public void cook(String pizzaName) {
    System.out.println(pizzaName+ " is being prepared.");
  }

  @Override
  public void work(String action) {
    System.out.println("Employee is " + action);
  }
}
