package com.example.kktea_web.ayesha_2531729;

import java.time.LocalDate;
import java.time.Period;

public abstract class Employee extends User {
    protected String nid;
    protected String department;
    protected String designation;
    protected String workerType;
    protected LocalDate dob;
    protected LocalDate joiningDate;
    protected double baseSalary;

    public Employee(int userId, String fullName, String email, String mobileNo,
                    String password, String role, String status, LocalDate registrationDateTime,
                    String nid, String department, String designation, String workerType,
                    LocalDate dob, LocalDate joiningDate, double baseSalary) {
        super(userId, fullName, email, mobileNo, password, role, status, registrationDateTime);
        this.nid = nid;
        this.department = department;
        this.designation = designation;
        this.workerType = workerType;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.baseSalary = baseSalary;
    }

    public Employee(int userId, String fullName, String email, String mobileNo, String password, String role, String status, LocalDate registrationDateTime) {
        super(userId, fullName, email, mobileNo, password, role, status, registrationDateTime);
    }

    public int calculateAge(LocalDate currentDate) {
        if (this.dob == null || currentDate == null || currentDate.isBefore(this.dob)) {
            return 0;
        }
        return Period.between(this.dob, currentDate).getYears();
    }

    public String calculateServiceLength() {
        if (this.joiningDate == null || LocalDate.now().isBefore(this.joiningDate)) {
            return "0 years, 0 months";
        }
        Period servicePeriod = Period.between(this.joiningDate, LocalDate.now());
        return servicePeriod.getYears() + " years, " + servicePeriod.getMonths() + " months";
    }

    public boolean applyForLeave(String leaveType, LocalDate startDate, LocalDate endDate, String reason) {
        if (leaveType == null || leaveType.isBlank() || reason == null || reason.isBlank()) {
            return false;
        }
        if (startDate == null || endDate == null || endDate.isBefore(startDate)) {
            return false;
        }
        return true;
    }

    // Abstract method overridden by QualityComplianceOfficer and SalesDistributionOfficer
    public abstract void generateDashboardSummary();

    public String getNid() { return nid; }
    public void setNid(String nid) { this.nid = nid; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    public String getWorkerType() { return workerType; }
    public void setWorkerType(String workerType) { this.workerType = workerType; }
    public LocalDate getDob() { return dob; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    public LocalDate getJoiningDate() { return joiningDate; }
    public void setJoiningDate(LocalDate joiningDate) { this.joiningDate = joiningDate; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}