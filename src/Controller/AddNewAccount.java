package Controller;

import Modele.Database;
import Modele.Operation;
import Modele.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddNewAccount implements Operation {
    public int accType;

    public  AddNewAccount(int accType){
        this.accType = accType;
    }


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

        try{
            ResultSet rs = database.getStatement().executeQuery("SELECT COUNT(*)");
            rs.next();
            int ID = rs.getInt("COUNT(*)");
            String insert = "INSERT INTO `Users`" +
                    "(`Id`, `Name`, `LastName`, `Password`, `Email`, `Phone`, `Type`)" +
                    " VALUES " +
                    "('"+ID+"','"+FirstName+"','"+LastName+"','"+Email+"','"+Phone+"'," +
                    "'"+Password+"','"+accType+"')";
            database.getStatement().executeUpdate(insert);
            System.out.println("account added");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

