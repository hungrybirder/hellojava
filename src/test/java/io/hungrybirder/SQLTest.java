package io.hungrybirder;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

/**
CREATE DATABASE test;
CREATE TABLE `datetime_test` (
`id` int NOT NULL AUTO_INCREMENT,
`t3` datetime(3) NOT NULL,
`t` datetime NOT NULL,
PRIMARY KEY (`id`)
);
CREATE USER 'test'@'localhost' IDENTIFIED BY 'oocahNgie{t3phou^shaeH';
GRANT ALL PRIVILEGES on test.* TO 'test'@'localhost';
FLUSH PRIVILEGES;

*/
/**
 * SQLTest
 */
public class SQLTest {

    private static DataSource getTestDataSource(String dbName) throws Exception {
        PoolProperties p = new PoolProperties();
        p.setUrl("jdbc:mysql://localhost:3306/" + dbName);
        p.setDriverClassName("com.mysql.jdbc.Driver");
        p.setUsername("test");
        p.setPassword("oocahNgie{t3phou^shaeH");
        p.setTestWhileIdle(false);
        p.setTestOnBorrow(true);
        p.setValidationQuery("SELECT 1");
        p.setTestOnReturn(false);
        p.setValidationInterval(30000);
        p.setTimeBetweenEvictionRunsMillis(30000);
        p.setMaxActive(10);
        p.setInitialSize(1);
        p.setMaxWait(10000);
        p.setRemoveAbandonedTimeout(60);
        p.setMinEvictableIdleTimeMillis(30000);
        p.setMinIdle(2);
        p.setLogAbandoned(true);
        p.setRemoveAbandoned(true);
        // p.setJdbcInterceptors(
        // "org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;" +
        // "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
        DataSource datasource = new DataSource();
        datasource.setPoolProperties(p);
        return datasource;
    }
}
