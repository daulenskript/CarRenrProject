package Controller;

import Modele.Admin;
import Modele.Client;
import Modele.Database;
import Modele.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static  void main(String[] args) {
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome bro: ");
        System.out.println("Enter Email: ");
        String email = scanner.next();
        System.out.println("Enter Password: ");
        String password = scanner.next();

        ArrayList<User> users = new ArrayList<>();

        try {
            String select = "SELECT * FROM `users` :";
            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()) {
                User user;
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String emailAddress = rs.getString("email");
                String pass= rs.getString("password");
                String number = rs.getString("number");
                int type = rs.getInt("type");

                switch (type) {
                    case 0:
                        user = new Client();
                        break;
                    case 1:
                        user = new Admin();
                        break;
                    default:
                        user = new Client();
                        break;
                }
                user.setId(id);
                user.setName(firstName);
                user.setLastName(lastName);
                user.setEmail(emailAddress);
                user.setPassword(pass);
                user.setPhone(number);
                users.add(user);

            }
        }catch (Exception e) {
            System.out.println(e);
        }
        for (User user : users) {
            if(user.getPassword().equals(password) && user.getEmail().equals(email)) {
                System.out.println("Welcome to car rent sys");
                user.ShowList(database  , scanner);
            }
    }

    }
}
