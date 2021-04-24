package model;

public abstract class Pizza {

  private final String name;
  private int price;
  private boolean isFreeSample = false;


  public Pizza(String name, int price){
    this.name=name;
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public boolean isFreeSample() {
    return isFreeSample;
  }

  public void setFreeSample(boolean freeSample) {
    isFreeSample = freeSample;
  }
}
