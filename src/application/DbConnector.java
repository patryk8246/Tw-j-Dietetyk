package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

	private static String url = String.format("jdbc:sqlserver://dietetyk.database.windows.net:1433;database=patryk8246;user=patryk8246@dietetyk;password=45Irtenhe!;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;seUnicode=true&characterEncoding=utf8&autoReconnect=true;");
	public static Connection connect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url);
			for(;;) {
			if(connection == null) {
				connection = DriverManager.getConnection(url);
			}
			if(connection != null) {
				break;
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Nie udało się połączyć z bazą danych");
		}
		return connection;
	}
}

