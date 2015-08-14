package main.java.connection;

import java.sql.Connection;

/**
 * Created by koushik on 8/10/15.
 */
public interface AbstractConnection {

    /**
     * Creates a connection to a database. Will throw an exception
     * to indicate whether or not the connection was successful
     *
     */
    void connect() throws ConnectionDriverNotFoundException, CouldNotConnectToJDBCException;

    /**
     * Returns the current database connection
     *
     * @return current database connection
     */
    Connection getConnection();

}
