public class Client extends User{
    public Client(){
        super();
    }

    @Override
    public void ShowList() {
        System.out.println("1.View cars");
        System.out.println("2.Rent rents");
        System.out.println("3.Return Car");
        System.out.println("4.Show my rents");
        System.out.println("5.Edit my data");
        System.out.println("6.Exit");

    }


}
