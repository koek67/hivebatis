package main.java.connection;

/**
 * Created by koushik on 8/10/15.
 */
public interface AbstractConnection {

    /**
     * Creates a connection to a database. Will return true or false
     * to indicate whether or not the connection was successful.
     *
     * @return success of connection
     */
    boolean connect();

}
