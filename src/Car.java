public class Car {
    private int Id;
    private int Year;
    private String Brand;
    private String Model;
    private String Color;
    private String Price;
    private boolean avaible;

    public Car(){

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }


    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }


    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        Price = price;
    }


    public boolean isAvaible() {
        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }


}
