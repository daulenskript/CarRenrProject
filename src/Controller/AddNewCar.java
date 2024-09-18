package Controller;

import Modele.Database;
import Modele.Operation;
import Modele.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class AddNewCar implements Operation{


    @Override
    public void operation(Database database, Scanner scanner, User user) {
        System.out.println("Enter car Brand");
        String brand = scanner.nextLine();
        System.out.println("Enter car Model");
        String model = scanner.nextLine();
        System.out.println("Enter car Year");
        int year = scanner.nextInt();
        System.out.println("Enter car Price");
        double price = scanner.nextDouble();
        System.out.println("Enter car Color");
        String color = scanner.nextLine();
        int avaible = 0;

        try {
            ResultSet rs = database.getStatement().executeQuery("SELECT COUNT(*)");
            rs.next();
            int ID = rs.getInt("COUNT(*)");
            String Insert = "INSERT INTO `cars` (`ID` , `BRAND` , `COLOR` , `YEAR` , `PRICE` , `MODEL`)";
            database.getStatement().executeUpdate(Insert);
            System.out.println("Car Added Successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }


        String Insert = "INSERT INTO `cars` (`ID` , `BRAND` , `COLOR` , `YEAR` , `PRICE` , `MODEL`)";
    }
}
