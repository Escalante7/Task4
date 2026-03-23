// Super class - Requirement 1: Inheritance Hierarchy
// Requirement 5: Encapsulation (all fields private)
public class Hardware {
    private int id;
    private String brand;
    private int spec;
    private String type;
    
public Hardware(int id, String brand, int spec, String type) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
        this.type = type;
    }
  
    // Getters for private fields
    public int getId() { return id; }
    public String getBrand() { return brand; }
    public int getSpec() { return spec; }
    public String getType() { return type; }

    // Requirement 2: Contextual Logic via Method Overriding
    // Default implementation - subclasses will override
    public String getSpecDisplay() {
        return String.valueOf(spec);
    }
