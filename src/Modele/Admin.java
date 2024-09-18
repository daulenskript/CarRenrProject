package Modele;

import Controller.AddNewAdmin;
import Controller.AddNewCar;
import Controller.ViewCars;

import java.util.Scanner;

public class Admin extends User {

    private Operation[] operations = new Operation[]{new AddNewAdmin() , new AddNewCar() , new ViewCars()};
    public Admin() {
        super();
    }
@Override
public void ShowList(Database database , Scanner scanner) {
        System.out.println(" 1.Add new car");
        System.out.println(" 2.Show all cars");
        System.out.println(" 3.Update car");
        System.out.println(" 4.Delete car");
        System.out.println(" 5.Update new Modele.Admin");
        System.out.println(" 6.Show rents");
        System.out.println(" 7.Quit");

        int i = scanner.nextInt();
        operations[i].operation(database , scanner ,this);
        ShowList(database , scanner);
    }
}
