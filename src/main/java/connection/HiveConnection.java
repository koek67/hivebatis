package main.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by koushik on 8/10/15.
 */
public class HiveConnection implements AbstractConnection {

    private String jdbcUrl;
    private String userName;
    private String password;
    private String driverName;
    private Connection connection;
    private int port;

    public String getJDBCUrl() {
        return jdbcUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getPort() {
        return port;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void connect() throws ConnectionDriverNotFoundException, CouldNotConnectToJDBCException {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(jdbcUrl, userName, password);
        } catch (ClassNotFoundException e) {
            throw new ConnectionDriverNotFoundException(driverName);
        } catch (SQLException e) {
            throw new CouldNotConnectToJDBCException(jdbcUrl, userName, password);
        }
    }

}
