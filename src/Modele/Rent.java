package Modele;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {
    private int Id;
    private User user;
    private Car car;
    private LocalDateTime dateTime;
    private int hours;
    private double total;
    private String status;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Rent() {
        dateTime = LocalDateTime.now();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public String getDateTime() {
        return formatter.format(dateTime);
    }
    public void setDateTime(String dateTimeString) {
        this.dateTime = LocalDateTime.parse(dateTimeString, formatter);
    }
}
