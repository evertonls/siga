package gov.amc.siga;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ImprimirTodasAsTabelas {
	
	public static void main(String[] argv) {

        System.out.println("PostgreSQL JDBC Connection Testing ~");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.err.println("Unable to find the PostgreSQL JDBC Driver!");
            e.printStackTrace();
            return;
        }

        // default database: postgres
        // JDK 7, auto close connection with try-with-resources
        try (Connection connection =
                     DriverManager.getConnection("jdbc:postgresql://localhost:5432/sigadb",
                             "siga_user", "123456789")) {


            DatabaseMetaData metaData = connection.getMetaData();

            try (ResultSet rs = metaData.getTables(null, null, "%", null)) {

                ResultSetMetaData rsMeta = rs.getMetaData();
                int columnCount = rsMeta.getColumnCount();

                while (rs.next()) {

                    System.out.println("\n----------");
                    System.out.println(rs.getString("TABLE_NAME"));
                    System.out.println("----------");

                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = rsMeta.getColumnName(i);
                        System.out.format("%s:%s\n", columnName, rs.getString(i));
                    }

                }
            }

        } catch (SQLException e) {
            System.err.println("Something went wrong!");
            e.printStackTrace();
            return;
        }

    }

}
