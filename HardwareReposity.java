import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HardwareRepository {

    private static final String DB_URL = "jdbc:sqlite:C:\\Users\\jeffr\\Downloads\\Task4\\src\\Task4.db";

    public List<Hardware> getAllHardware() {
        List<Hardware> hardwareList = new ArrayList<>();

        String[] possibleTables = {
                "\"HARDWARE MASTERLIST\"",
                "Hardware_Masterlist",
                "hardware_masterlist"
        };

        for (String table : possibleTables) {
            try (Connection conn = DriverManager.getConnection(DB_URL);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM " + table)) {



            } catch (SQLException e) {}
        }

        System.out.println("Error: Could not connect to database.");
        return hardwareList;
    }
}
