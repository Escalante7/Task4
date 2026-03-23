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

        for (Hardware h : hardwareList) {
            System.out.println(h);
        }

        // Requirement 4: Polymorphic Audit
        // Single loop with instanceof to count items
        int total16GBLaptops = 0;
        int total32GBLaptops = 0;
        int total50MPPhones = 0;

        // Can easily add more counters for 8GB, 4GB, etc. as needed
        int total48MPPhones = 0;
        int total16MPPhones = 0;

        for (Hardware h : hardwareList) {
            if (h instanceof Laptop) {
                Laptop laptop = (Laptop) h;
                if (laptop.getSpec() == 16) total16GBLaptops++;
                if (laptop.getSpec() == 32) total32GBLaptops++;
                // Easy to add: if (laptop.getSpec() == 8) total8GBLaptops++;

                 }
            else if (h instanceof Phone) {
                Phone phone = (Phone) h;
                if (phone.getSpec() == 50) total50MPPhones++;
                if (phone.getSpec() == 48) total48MPPhones++;
                if (phone.getSpec() == 16) total16MPPhones++;
                // Easy to add: if (phone.getSpec() == 108) total108MPPhones++;
            }
        }

        // Print Inventory
        System.out.println("\n=== LAPTOP AND PHONE INVENTORY ===");
        System.out.println("Total 16GB Laptops: " + total16GBLaptops);
        System.out.println("Total 32GB Laptops: " + total32GBLaptops);
        System.out.println("Total 50MP Phones: " + total50MPPhones);
        System.out.println("Total 48MP Phones: " + total48MPPhones);
        System.out.println("Total 16MP Phones: " + total16MPPhones);
    }
}
