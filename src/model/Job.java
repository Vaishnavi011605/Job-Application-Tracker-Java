package model;

public class Job {

    private String companyName;
    private String role;
    private String location;
    private String appliedDate;
    private String status;

    // Constructor
    public Job(String companyName, String role, String location, String appliedDate, String status) {
        this.companyName = companyName;
        this.role = role;
        this.location = location;
        this.appliedDate = appliedDate;
        this.status = status;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString() for clean output
    @Override
    public String toString() {
        return "Company   : " + companyName + "\n" +
                "Role      : " + role + "\n" +
                "Location  : " + location + "\n" +
                "Date      : " + appliedDate + "\n" +
                "Status    : " + status + "\n" +
                "---------------------------";
    }
}
