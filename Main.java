//// Package declaration - this defines the package name for your class
//package com.example;
//
//// Importing the necessary JDBC classes
//import java.sql.Connection;      // Used to create a connection with the database
//import java.sql.DriverManager;   // Used to manage JDBC drivers and establish connection
//import java.sql.SQLException;    // Used to handle SQL-related exceptions
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Database credentials (username and password)
//        String user = "root";      // MySQL username
//        String pass = "12345";     // MySQL password
//
//        // URL to connect to the MySQL database
//        // jdbc:mysql:// - protocol for MySQL database
//        // localhost - means the database is running on your local computer
//        // 3306 - default MySQL port number
//        // learningmysql - name of the database you created in MySQL
//        String url = "jdbc:mysql://localhost:3306/learningmysql";
//
//        System.out.println("Connecting to the database...");
//
//        // Step 1: Declare the connection variable
//        // Initially set to null (no connection yet)
//        Connection conn = null;
//
//        try {
//
//
//            // Step 3: Establish connection to the database
//            // DriverManager tries to connect using the given URL, username, and password.
//            conn = DriverManager.getConnection(url, user, pass);
//
//            // If connection succeeds, this line executes
//            System.out.println(" Connected to the database!");
//
//        } catch (Exception e) {
//            // Step 4: If any error occurs (e.g., wrong password or driver issue)
//            // the catch block will execute
//            System.out.println(" Error: " + e.getMessage());
//        } finally {
//            // Step 5: This block runs no matter what happens (success or failure)
//            // Used to safely close the connection to avoid memory leaks
//            if (conn != null) {
//                try {
//                    conn.close(); // Close the connection when done
//                    System.out.println(" Connection closed.");
//                } catch (SQLException e) {
//                    // Handle any errors that occur while closing
//                    System.out.println(" Error while closing: " + e.getMessage());
//                }
//            }
//        }
//    }
//}





//package com.example;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) {
//        String user = "root";
//        String pass = "12345";
//        String url = "jdbc:mysql://localhost:3306/learningmysql";
//
//        System.out.println("Connecting to the database...");
//        Connection conn = null;
//
//        try {
//            // Establish connection
//            conn = DriverManager.getConnection(url, user, pass);
//            System.out.println(" Connected to the database!");
//
//        }
//        catch (Exception e) {
//            System.out.println(" Error: " + e.getMessage());
//        }
//        finally
//        {
//            // Close connection safely
//            if (conn != null) {
//                try {
//                    conn.close();
//                    System.out.println(" Connection closed.");
//                } catch (SQLException e) {
//                    System.out.println(" Error while closing: " + e.getMessage());
//                }
//            }
//        }
//    }
//}
// another method
//•	Uses Java 7+ feature: Try-with-Resources.
//        •	Automatically closes the connection after the try block, even if an exception occurs.
//        •	Cleaner, safer, and more readable.
//        •	No need for a finally block or manual close.


package com.example;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) {
//        String user = "root";
//        String pass = "12345";
//        String url = "jdbc:mysql://localhost:3306/learningmysql"; // ✅ Correct URL
//
//        System.out.println("Connecting to the database...");
//
//
//        try( Connection conn = DriverManager.getConnection(url, user, pass)) {
//
//            // Establish connection
//            if(conn != null) {
//                System.out.println(" Connected to the database!");
//            }
//        } catch (Exception e) {
//            System.out.println("Connection Failed... ");
//        }
//    }
//}
// another method  mordern way
// try with idea way( try with conn)


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Main {
//    public static void main(String[] args) {
//        String user = "root";
//        String pass = "12345564";
//        String url = "jdbc:mysql://localhost:3306/learningmysql"; // ✅ Correct URL
//
//        System.out.println("Connecting to the database...");
//
//
//        try {
//            Connection conn = DriverManager.getConnection(url, user, pass);
//            // Establish connection
//            if(conn != null) {
//                System.out.println(" Connected to the database!");
//            }
//        } catch (Exception e) {
//            System.out.println("Connection Failed... ");
//        }
//    }
//}

//package com.example;  // Package name for organizing your code
//
//// Importing required JDBC classes
//import java.sql.Connection;      // Used to establish a connection with the database
//import java.sql.DriverManager;   // Used to get the database connection
//import java.sql.SQLException;    // Handles SQL-related exceptions
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Database credentials and URL
//        String user = "root";    // MySQL username
//        String pass = "12345";   // MySQL password
//        String url = "jdbc:mysql://localhost:3306/learningmysql";
//        // ↑ JDBC URL format: jdbc:mysql://<host>:<port>/<database_name>
//
//        System.out.println("Connecting to the database...");
//
//        //  try-with-resources — automatically closes the connection after try block ends
//        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
//
//            // Check if the connection is successfully established
//            if (conn != null) {
//                System.out.println(" Connected to the database!");
//            }
//
//        } catch (SQLException e) {
//            // Handles any SQL or connection errors
//            System.out.println(" Connection Failed! Error: " + e.getMessage());
//        }
//
//        // No need for 'finally' block — connection closes automatically here
//    }
//}
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class Main {
//    public static void main(String[] args) {
//        String user = "root";
//        String password = "12345";
//        String url = "jdbc:mysql://localhost:3306/learningmysql";
//
//        System.out.println("Connecting to the database...");
//
//        try {
//            // 1. Load the JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // 2. Establish the connection
//            Connection conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connection established successfully!");
//
//            // 3. Close the connection
//            conn.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Properties;
//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Connecting to the database...");
//
//        try {
//            // 1⃣ Load properties from external file
//            Properties prop = new Properties();
//            prop.load(new FileInputStream("db.properties"));
//
//            // 2⃣ Read values from db.properties file
//            String url = prop.getProperty("dburl");
//            String user = prop.getProperty("user");
//            String password = prop.getProperty("password");
//
//            // 3️ Load the JDBC driver manually
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // 4️ Establish the connection
//            Connection conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connection established successfully!");
//
//            // 5️ Close the connection
//            conn.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//The first code loads the JDBC driver manually
//        using Class.forName() and doesn’t use try-with-resources,
//        so connections and streams must be closed manually.
//        The second code uses try-with-resources for safer resource
//        handling and automatically closes the FileInputStream and Connection,
//        removing the need to load the driver explicitly.
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.Properties;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Connecting to the database...");
//
//        // Step 1: Create a Properties object
//        Properties prop = new Properties();
//
//        // Step 2: Load db.properties file safely using try-with-resources
//        try (FileInputStream fis = new FileInputStream("db.properties")) {
//            prop.load(fis);
//        } catch (Exception e) {
//            System.out.println("Error loading properties file: " + e.getMessage());
//            return; // Exit if properties not loaded
//        }
//
//        // Step 3: Get database credentials from file
//        String url = prop.getProperty("dburl");
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//
//        // Step 4: Try to connect to the database
//        try (Connection conn = DriverManager.getConnection(url, user, password)) {
//            if (conn != null) {
//                System.out.println(" Connected to the database successfully!");
//            } else {
//                System.out.println(" Connection object is null!");
//            }
//        } catch (Exception e) {
//            System.out.println("Connection Failed: " + e.getMessage());
//        }
//    }
//}
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Properties;
//
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Connecting to the database...");
//
//        // Step 1: Create a Properties object
//        Properties prop = new Properties();
//
//        // Step 2: Load db.properties file safely using try-with-resources
//        try (FileInputStream fis = new FileInputStream("db.properties")) {
//            prop.load(fis);
//        } catch (Exception e) {
//            System.out.println("Error loading properties file: " + e.getMessage());
//            return; // Exit if properties not loaded
//        }
//
//        // Step 3: Get database credentials from file
//        String url = prop.getProperty("dburl");
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//
//        // Step 4: Connect to database and fetch employee details
//        try (Connection conn = DriverManager.getConnection(url, user, password);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {
//
//            System.out.println("Connection Successful!");
//            System.out.println("Employees Data:");
//            System.out.println("***************************************");
//
//            // Step 5: Display data
//            while (rs.next()) {
//                String fname = rs.getString("firstName");
//                String empNo = rs.getString("employeeNumber");
//                String jtitle = rs.getString("jobTitle");
//
//                System.out.println("Employee No: " + empNo);
//                System.out.println("First Name : " + fname);
//                System.out.println(empNo + ", " + fname + ", " + jtitle);
//
//            }
//
//        } catch (Exception e) {
//            System.out.println("Connection Failed: " + e.getMessage());
//        }
//    }
//}





//import com.mysql.cj.jdbc.MysqlDataSource;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.util.Properties;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Properties prop = new Properties(); // ✅ Move this outside the try block
//
//        // Step 1: Load db.properties file
//        try (FileInputStream fis = new FileInputStream("db.properties")) {
//            prop.load(fis);
//        } catch (Exception e) {
//            System.out.println("Error loading properties file: " + e.getMessage());
//            return; // Exit if file not loaded
//        }
//
//        // Step 2: Read values from the properties file
//        String url = prop.getProperty("dburl");
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//
//        // Step 3: Configure the MySQL DataSource
//        MysqlDataSource dataSource = new MysqlDataSource();
//        dataSource.setURL(url);
//        dataSource.setUser(user);
//        dataSource.setPassword(password);
//
//        // Step 4: Connect to the database
//        try (Connection con = dataSource.getConnection()) {
//            System.out.println("Connected to database successfully!");
//        } catch (Exception e) {
//            System.out.println("Connection Failed: " + e.getMessage());
//        }
//    }
//}
//we need not to be close datasourse it automatically done
//import com.mysql.cj.jdbc.MysqlDataSource;
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Properties;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // Step 1: Load properties file
//        Properties prop = new Properties();
//
//        try (FileInputStream fis = new FileInputStream("db.properties")) {
//            prop.load(fis);
//        } catch (Exception e) {
//            System.out.println("Error loading properties file: " + e.getMessage());
//            return;
//        }
//
//        // Step 2: Read database details
//        String url = prop.getProperty("dburl");
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//
//        // Step 3: Create a MySQLDataSource object
//        MysqlDataSource dataSource = new MysqlDataSource();
//        dataSource.setURL(url);
//        dataSource.setUser(user);
//        dataSource.setPassword(password);
//
//        System.out.println("Connecting to the database...");
//
//        // Step 4: Establish connection and query data
//        try (Connection conn = dataSource.getConnection();
//             Statement stmt = conn.createStatement();
////             Statement is used to send SQL queries to the database.
//             ResultSet rs = stmt.executeQuery("SELECT firstName, employeeNumber, jobTitle FROM employees")) {
//
//            System.out.println("Connection Successful!");
//            System.out.println("***************************************");
//
//            while (rs.next()) {
//                String fname = rs.getString("firstName");
//                String empNo = rs.getString("employeeNumber");
//                String jtitle = rs.getString("jobTitle");
//
//                System.out.println(empNo + ", " + fname + ", " + jtitle);
//            }
//
//        } catch (Exception e) {
//            System.out.println("Connection Failed: " + e.getMessage());
//        }
//    }
//}
//


//import com.mysql.cj.jdbc.MysqlDataSource;
//
//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Properties;
//
//public class Main {
//    public static void main(String[] args) {
//        Properties prop = new Properties();
//
//        // Step 2: Load db.properties file safely using try-with-resources
//        try (FileInputStream fis = new FileInputStream("db.properties")) {
//            prop.load(fis);
//        } catch (Exception e) {
//            System.out.println("Error loading properties file: " + e.getMessage());
//            // Exit if properties not loaded
//        }
//
//        // Step 3: Get database credentials from file
//        String url = prop.getProperty("dburl");
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//        String query = "SELECT * FROM employees";
//
//        MysqlDataSource datasource = new MysqlDataSource();
//        datasource.setURL(url);
//        datasource.setUser(user);
//        datasource.setPassword(password);
////        test this connection
//        try(Connection conn = datasource.getConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query)) {
//
//            System.out.println("Connected to database successfully!");
//            System.out.println("Employee Number | Name | job title");
//
//            while(rs.next()) {
//
//
//                String  empNo= rs.getString("employeeNumber");
//                String fname= rs.getString("firstname");
//                String jTitle= rs.getString("jobTitle");
//                System.out.printf("%s | %s | %s \n", empNo, fname, jTitle);
//            }}
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}


//import java.io.FileInputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.util.Properties;
//
//public class Main
//{
//    public static void main(String[] args) {
//        Properties prop = new Properties();
//
//        // Step 1: Load db.properties file
//        try (FileInputStream fis = new FileInputStream("db.properties")) {
//            prop.load(fis);
//        } catch (Exception e) {
//            System.out.println("Error loading properties file: " + e.getMessage());
//            return; // stop execution if properties not loaded
//        }
//
//        // Step 2: Read database credentials
//        String url = prop.getProperty("dburl");
//        String user = prop.getProperty("user");
//        String password = prop.getProperty("password");
//
//        // Step 3: Create SQL query to insert data
//        String query = "INSERT INTO employees (employeeNumber, firstName, lastName, extension, email, officeCode, reportsTo, jobTitle) " +
//                "VALUES (2208, 'nandhini', 'srinivasan', 'x2312', 'amol@classicmodelcars.com', 4, 1102, 'Sales Rep')";
//
//        // Step 4: Connect to database and execute query
//        try (Connection conn = DriverManager.getConnection(url, user, password);
//             Statement stmt = conn.createStatement()) {
//
//            int rows = stmt.executeUpdate(query);
//            System.out.println(rows + " record(s) inserted successfully!");
//
//        } catch (Exception e) {
//            System.out.println("Database error: " + e.getMessage());
//        }
//    }
//}

// Defines the package name for organizing your Java files

import java.io.FileInputStream;   // To read the db.properties file
import java.sql.Connection;       // Represents a connection to the database
import java.sql.DriverManager;    // Used to get database connections
import java.sql.Statement;        // Used to execute SQL statements
import java.util.Properties;      // To load key–value pairs from a properties file

public class Main {
    public static void main(String[] args) {

        // Step 1: Create a Properties object to hold database connection info
        Properties prop = new Properties();

        // Step 2: Load db.properties file using try-with-resources
        // try-with-resources automatically closes the FileInputStream after use
        try (FileInputStream fis = new FileInputStream("db.properties")) {
            // Load the properties (key=value pairs) from the file
            prop.load(fis);
        } catch (Exception e) {
            // If there's an error (e.g., file not found), print error message
            System.out.println("Error loading properties file: " + e.getMessage());
            return; // Exit the program if properties file not loaded properly
        }

        // Step 3: Read database connection details from the properties file
        // The file should contain keys like dburl, user, and password
        String url = prop.getProperty("dburl");      // e.g. jdbc:mysql://localhost:3306/classicmodels
        String user = prop.getProperty("user");      // e.g. root
        String password = prop.getProperty("password");  // e.g. 1234

        // Step 4: Write the SQL INSERT query to add a new employee record
        String query = "UPDATE employees SET jobTitle='Junior Developer' WHERE employeeNumber=2208";

        // Step 5: Establish the connection and execute the SQL statement
        // try-with-resources ensures the connection and statement are closed automatically
        try (Connection conn = DriverManager.getConnection(url, user, password); // Open connection
             Statement stmt = conn.createStatement()) { // Create statement object to send SQL commands

            // Step 6: Execute the INSERT query
            // executeUpdate() is used for INSERT, UPDATE, or DELETE queries
            int rows = stmt.executeUpdate(query);

            // Step 7: Print confirmation of how many records were inserted
            System.out.println(rows + " record(s) updated successfully!");

        } catch (Exception e) {
            // If any SQL or connection error occurs, print the error message
            System.out.println("Database error: " + e.getMessage());
        }
    }
}