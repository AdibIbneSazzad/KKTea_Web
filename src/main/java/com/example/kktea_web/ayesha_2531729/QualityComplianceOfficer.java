
package com.example.kktea_web.ayesha_2531729;

import java.time.LocalDate;

public class QualityComplianceOfficer extends Employee {

   // private static final long serialVersionUID = 1L;
    private String assignedZone;

    public QualityComplianceOfficer(int userId, String fullName, String email, String mobileNo,
                                    String password, String status, LocalDate registrationDateTime,
                                    String nid, String department, String designation, String workerType,
                                    LocalDate dob, LocalDate joiningDate, double baseSalary, String assignedZone) {
        super(userId, fullName, email, mobileNo, password, "Quality & Compliance Officer", status, registrationDateTime,
                nid, department, designation, workerType, dob, joiningDate, baseSalary);
        this.assignedZone = assignedZone;
    }

    @Override
    public void loadDashboard() {
        System.out.println("Loading Quality & Compliance Officer Dashboard for " + fullName + " (" + assignedZone + ")");
    }

    @Override
    public void generateDashboardSummary() {
        System.out.println("Quality Compliance Summary | Officer: " + fullName
                + " | Dept: " + department
                + " | Zone: " + assignedZone
                + " | Service: " + calculateServiceLength());
    }

    public String getAssignedZone() {
        return assignedZone; }
    public void setAssignedZone(String assignedZone) {
        this.assignedZone = assignedZone; }
}