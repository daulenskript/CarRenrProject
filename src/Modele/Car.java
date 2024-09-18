package Modele;

public class Car {
    private int Id;
    private int Year;
    private String Brand;
    private String Model;
    private String Color;
    private String Price;
    private int avaible;

    public Car(){

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }


    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }


    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }


    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        this.Price = price;
    }


    public int isAvaible() {
        return avaible;
    }

    public void setAvaible(int avaibles) {
        this.avaible = avaibles;
    }


}
