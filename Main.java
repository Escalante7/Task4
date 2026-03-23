import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Get data from repository only
        HardwareRepository repo = new HardwareRepository();
        List<Hardware> hardwareList = repo.getAllHardware();

        // Print Hardware Masterlist
        System.out.println("=== HARDWARE MASTERLIST ===");
        System.out.printf("%-5s %-20s %-15s %-15s%n", "ID", "Brand", "Type", "Spec");
        System.out.println("----------------------------------------------------");
