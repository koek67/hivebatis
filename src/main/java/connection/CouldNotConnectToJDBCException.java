package main.java.connection;

/**
 * Created by koushik on 8/11/15.
 */
public class CouldNotConnectToJDBCException extends Exception {

    public CouldNotConnectToJDBCException(String jdbcUrl, String user, String password) {
        super("Could not connect to " + jdbcUrl + "with username: " + user + " and password: " + password);
    }

}
