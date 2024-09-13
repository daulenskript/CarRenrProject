package Modele;

import java.sql.*;

public class Database {
    private String user = "user";
    private String Password = "1q2w3e4r5t6y";
    private String url  = "jdbc:mysql://localhost:3306/";
    private Statement statement;

    public Database() {
        try{
            Connection connect = DriverManager.getConnection(url, user, Password);
            statement = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Statement getStatement() {
        return statement;
    }
}
