package homwork10.model;

public class Company {
    public String getId;
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private int employeeCount;

    public Company(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}