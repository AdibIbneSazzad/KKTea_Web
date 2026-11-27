package com.example.kktea_web.ayesha_2531729;

import java.time.LocalDate;

public class SalesDistributionOfficer extends Employee{
   // private static final long serialVersionUID = 1L;
    private String salesRegion;

    public SalesDistributionOfficer(int userId, String fullName, String email, String mobileNo,
                                    String password, String status, LocalDate registrationDateTime,
                                    String nid, String department, String designation, String workerType,
                                    LocalDate dob, LocalDate joiningDate, double baseSalary, String salesRegion) {
        super(userId, fullName, email, mobileNo, password, "Sales & Distribution Officer", status, registrationDateTime,
                nid, department, designation, workerType, dob, joiningDate, baseSalary);
        this.salesRegion = salesRegion;
    }

    @Override
    public void loadDashboard() {
        System.out.println("Loading Sales & Distribution Officer Dashboard for " + fullName + " (" + salesRegion + ")");
    }

    @Override
    public void generateDashboardSummary() {
        System.out.println("Sales & Distribution Summary | Officer: " + fullName
                + " | Dept: " + department
                + " | Region: " + salesRegion
                + " | Service: " + calculateServiceLength());
    }

    public String getSalesRegion() { return salesRegion; }
    public void setSalesRegion(String salesRegion) { this.salesRegion = salesRegion; }
}
