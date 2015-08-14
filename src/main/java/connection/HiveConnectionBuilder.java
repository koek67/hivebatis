package main.java.connection;

/**
 * Will read a config file and use parameters in there to establish a
 * JDBCConnection to a HiveServer.
 *
 * @author koushik
 */
public class HiveConnectionBuilder {

    public static HiveConnection build() {
        HiveConnection hiveConnection = new HiveConnection();
        hiveConnection.setDriverName("com.amazon.hive.jdbc4.HS2Driver");
        hiveConnection.setJdbcUrl("jdbc:hive2://localhost");
        hiveConnection.setPort(10000);

        return hiveConnection;
    }

}
