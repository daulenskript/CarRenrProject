package Controller;

import Modele.Car;
import Modele.Database;
import Modele.Operation;
import Modele.User;

import javax.swing.text.View;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewCars implements Operation{

    @Override
    public void operation(Database database, Scanner scanner, User user) {
        System.out.println("Select car in system");
        String select = "SELECT * FROM `cars`";
        ArrayList<Car> cars = new ArrayList<>();
        try {

            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()) {
                Car car = new Car();

                car.setId(rs.getInt("id"));
                car.setBrand(rs.getString("brand"));
                car.setModel(rs.getString("model"));
                car.setColor(rs.getString("color"));
                car.setYear(rs.getInt("year"));
                car.setPrice(rs.getString("price"));
                car.setAvaible(rs.getInt("avaible"));
                cars.add(car);

            }
        }catch (Exception e){
            System.out.println(e);
        }
        for (Car s : cars){
            if (s.isAvaible() <2){
                System.out.println("ID" + s.getId());
                System.out.println("Brand" + s.getBrand());
                System.out.println("Model" + s.getModel());
                System.out.println("Color" + s.getColor());
                System.out.println("Year" + s.getYear());
                System.out.println("Price" + s.getPrice());
                System.out.println("Avaible" + s.isAvaible());

            }
        }


    }
}
