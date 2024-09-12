package Modele;

public class Admin extends User {
    public Admin() {
        super();
    }

    @Override
    public void ShowList() {
        System.out.println(" 1.Add new car");
        System.out.println(" 2.Show all cars");
        System.out.println(" 3.Update car");
        System.out.println(" 4.Delete car");
        System.out.println(" 5.Update new Modele.Admin");
        System.out.println(" 6.Show rents");
        System.out.println(" 7.Quit");
    }
}
