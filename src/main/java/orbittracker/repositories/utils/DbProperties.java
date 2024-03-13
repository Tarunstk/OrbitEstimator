package orbittracker.repositories.utils;

public class DbProperties {
    // Singleton Pattern to load only one property per instance.
    private static volatile DbProperties instance;

    private String url = "jdbc:postgresql://localhost:5432/satellites";
    private String password = "1797";
    private String username = "postgres";

    // Private constructor to prevent instantiation from outside
    private DbProperties() {
    }

    public static DbProperties getInstance() {
        // Double-checking for thread safety
        if (instance == null) {
            synchronized (DbProperties.class) {
                if (instance == null) {
                    instance = new DbProperties();
                }
            }
        }
        return instance;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "DbProperties{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
