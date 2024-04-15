package testDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	

	private static final String DB_NAME = "testjava.db";
	private static final String CONNECTION_STRING = "jdbc:sqlite:C:\\databases\\" + DB_NAME;
	
	private static final String TABLE_CONTACTS = "contacts";

	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_PHONE = "phone";
	private static final String COLUMN_EMAIL = "email";
	
	public static void main(String[] args) {

		
		try {
			
			Connection conn = DriverManager.getConnection(CONNECTION_STRING); // Windows path
//			Class.forName("org.sql.JDBC"); // Old way
			Statement statement = conn.createStatement();
			
			
			statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
			
	        statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                     " (" + COLUMN_NAME + " text, " +
                            COLUMN_PHONE + " integer, " +
                            COLUMN_EMAIL + " text" +
                     ")");
            statement.execute("INSERT INTO contacts (name, phone, email) " +
                  "VALUES('Joe', 45632, 'joe@anywhere.com')");

            statement.execute("INSERT INTO contacts (name, phone, email) " +
            		"VALUES('Jane', 4829484, 'jane@somewhere.com')");

            statement.execute("INSERT INTO contacts (name, phone, email) " +
            		"VALUES('Fido', 9038, 'dog@email.com')");

			statement.execute("DELETE FROM contacts WHERE name = 'Joe'");

//		    statement.execute("SELECT * FROM contacts");
//	        ResultSet results = statement.getResultSet();
			ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS); // We can also use executeQuery()
	        while(results.next()) {
	                System.out.println(results.getString(COLUMN_NAME) + " " +
	                                   results.getInt(COLUMN_PHONE) + " " +
	                                   results.getString(COLUMN_EMAIL));
	        }
			
	        results.close();
			statement.close(); // Statements should be closed before connections
			conn.close();		// Closing connections is important, but after statement is closed
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went wrong: " + e.getMessage());
		}
		
	}
	
    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
