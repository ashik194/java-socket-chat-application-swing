/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author ORANGEBD
 */
public class Model_Register {
    public String getUsername() {
        return username;
    }

    public void getUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model_Register(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Model_Register() {
    }

    private String username;
    private String password;

    public JSONObject toJsonObject() {
        try {
            JSONObject json = new JSONObject();
            json.put("username", username);
            json.put("password", password);
            return json;
        } catch (JSONException e) {
            return null;
        }
    }
}
