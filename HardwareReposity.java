import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Requirement 3: Data Retrieval - All SQL is here
// No SQL in Main or Hardware classes
public class HardwareRepository {

    private static final String DB_URL = "jdbc:sqlite:C:\\Users\\jeffr\\Downloads\\Task4\\src\\Task4.db";

    public List<Hardware> getAllHardware() {
        List<Hardware> hardwareList = new ArrayList<>();

        // Try different table name variations
        String[] possibleTables = {
                "\"HARDWARE MASTERLIST\"",
                "Hardware_Masterlist",
                "hardware_masterlist"
        };

    }
}
