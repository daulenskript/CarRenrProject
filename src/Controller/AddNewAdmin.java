package Controller;

import Modele.Database;
import Modele.Operation;
import Modele.User;

import java.util.Scanner;

public class AddNewAdmin implements Operation {
    @Override
    public void operation(Database database, Scanner scanner, User user) {
        System.out.println("Please enter the name of the admin");
        String FirstName = scanner.next();
        System.out.println("Please enter the LastName of the admin");
        String LastName = scanner.next();
        System.out.println("Please enter the Email of the admin");
        String Email = scanner.next();
        System.out.println("Please enter the Phone of the admin");
        String Phone = scanner.next();
        System.out.println("Please enter the Password of the admin");
        String Password = scanner.next();
        System.out.println("Please confirm Password of the admin");
        String ConfirmPassword = scanner.next();
        while (Password.equals(ConfirmPassword)) {
            System.out.println("Passwords do not match");
            System.out.println("Please enter the Password of the admin");
            Password = scanner.next();
            System.out.println("Please confirm Password of the admin");
            ConfirmPassword = scanner.next();
        }
        int accType = 1;

    }
}
