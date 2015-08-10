package main.java.connection;

/**
 * Created by koushik on 8/10/15.
 */
public class HiveConnection implements AbstractConnection {

    private String jdbcUrl;
    private String userName;
    private String password;

    public String getJDBCUrl() {
        return jdbcUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean connect() {
        return false;
    }

}
