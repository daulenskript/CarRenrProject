package Controller;

import Modele.Database;
import Modele.Operation;
import Modele.User;

import java.util.Scanner;

public class UpdateCar implements Operation {
    @Override
    public void operation(Database database, Scanner scanner, User user) {
        System.out.print("Enter Car ID: ");
        Integer carID = scanner.nextInt();

        String update = "INSERT INTO `cars` (`ID` , `BRAND` , `COLOR` , `YEAR` , `PRICE` , `MODEL`)";

    }
}
