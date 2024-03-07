package com.example.src.main.java.orbittracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class satelliteDB {
    Connection conn = null;
    dbProperties db = new dbProperties();
    public satelliteDB(){
        try {
            conn = DriverManager.getConnection(db.getUrl(),db.getUsername(),db.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void save(satellite s){
        String query = " insert into satellites (name, inc, raan, e, omega, n0, v0) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,s.getName());
            st.setDouble(2,s.getIn());
            st.setDouble(3,s.getRaan());
            st.setDouble(4,s.getE());
            st.setDouble(5,s.getOmega());
            st.setDouble(6,s.getN0());
            st.setDouble(7,s.getV0());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
