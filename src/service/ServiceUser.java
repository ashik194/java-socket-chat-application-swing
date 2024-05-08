/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Model_Message;
import model.Model_Register;

/**
 *
 * @author ORANGEBD
 */
public class ServiceUser {
    public ServiceUser() {
        this.con = DatabaseConnection.getInstance().getConnection();
    }

    public Model_Message register(Model_Register data) {
        //  Check user exit
        Model_Message message = new Model_Message();
        try {
            PreparedStatement p = con.prepareStatement(CHECK_USER);
            p.setString(1, data.getUsername());
            ResultSet r = p.executeQuery();
            if (r.first()) {
                message.setAction(false);
                message.setMessage("User Already Exists");
            } else {
                message.setAction(true);
            }
            r.close();
            p.close();
            if (message.isAction()) {
                //  Insert User Register
                p = con.prepareStatement(INSERT_USER);
                p.setString(1, data.getUsername());
                p.setString(2, data.getPassword());
                p.execute();
                p.close();
                message.setAction(true);
                message.setMessage("Ok");
            }
        } catch (SQLException e) {
            message.setAction(false);
            message.setMessage("Server Error");
        }
        return message;
    }
    private final String INSERT_USER = "insert into user (`username`, `password`) values (?,?)";
    private final String CHECK_USER = "select userID from user where username =? limit 1";
    //  Instance
    private final Connection con;
}
