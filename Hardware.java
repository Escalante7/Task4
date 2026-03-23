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
