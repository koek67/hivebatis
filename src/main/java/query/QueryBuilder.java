package main.java.query;

import java.sql.PreparedStatement;

/**
 * Created by koushik on 8/13/15.
 */
public interface QueryBuilder {

    /**
     * Will create a prepared statement out of a string database query
     * @param s query
     * @return prepared statement
     */
    PreparedStatement build(String s);

}
