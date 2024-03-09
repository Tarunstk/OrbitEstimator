package orbittracker.repositories;

import orbittracker.models.Satellite;
import orbittracker.repositories.utils.DbProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SatelliteDB {

    // Singleton Pattern to load only one database connection per instance.

    private static volatile SatelliteDB instance;
    private final Connection conn;
    private final DbProperties db = DbProperties.getInstance();

    // Private constructor to prevent instantiation from outside
    private SatelliteDB() {
        try {
            conn = DriverManager.getConnection(db.getUrl(), db.getUsername(), db.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static SatelliteDB getInstance() {
        // Double-checking for thread safety
        if (instance == null) {
            synchronized (SatelliteDB.class) {
                if (instance == null) {
                    instance = new SatelliteDB();
                }
            }
        }
        return instance;
    }

    public void save(Satellite s) {
        String query = " insert into satellites (name, inc, raan, e, omega, n0, v0) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, s.getName());
            st.setDouble(2, s.getIn());
            st.setDouble(3, s.getRaan());
            st.setDouble(4, s.getE());
            st.setDouble(5, s.getOmega());
            st.setDouble(6, s.getN0());
            st.setDouble(7, s.getV0());
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
