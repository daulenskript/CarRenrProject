package Modele;

public abstract class User {
    private int Id;
    private String Name;
    private String LstName;
    private String Password;
    private String Email;
    private String Phone;

    public User(){

    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }


    public String getLstName() {
        return LstName;
    }

    public void setLstName(String lstName) {
        this.LstName = lstName;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }


    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public abstract void ShowList();

}
