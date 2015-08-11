package main.java.connection;

/**
 * Created by koushik on 8/11/15.
 */
public class ConnectionDriverNotFoundException extends Exception {

    public ConnectionDriverNotFoundException(String driverName) {
        super("The hive driver " + driverName + " was not found.");
    }

}
