package model.connectionPool;

import org.apache.commons.pool.impl.GenericObjectPool;

import javax.sql.DataSource;

public class ConnectionPool {

    //JDBC Driver Name & Database URL
    static final String JDBC_DRIVER = "com.mysql.Driver";
    static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/hospitaldb";

    //JDBC Database Credentials
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "root";

    private static GenericObjectPool genericObjectPool = null;

    @SuppressWarnings("unused")
    public DataSource setUpPool() throws Exception {
        Class.forName(JDBC_DRIVER);


        return null;
    }


}
