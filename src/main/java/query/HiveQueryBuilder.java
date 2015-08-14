package main.java.query;

import main.java.connection.HiveConnection;
import main.java.connection.HiveConnectionBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by koushik on 8/13/15.
 */
public class HiveQueryBuilder implements QueryBuilder {

    @Override
    public PreparedStatement build(String s) {
        HiveConnection hiveConnection = HiveConnectionBuilder.build();
        Connection connection = hiveConnection.getConnection();
        return null;
    }

}
