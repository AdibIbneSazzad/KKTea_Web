package com.example.kktea_web.ayesha_2531729;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class User implements Serializable {
    protected final int userId;
    protected String fullName;
    protected String email;
    protected String mobileNo;
    protected String password;
    protected String role;
    protected String status;
    protected LocalDate registrationDateTime;

    public User(int userId,
                String fullName,
                String email,
                String mobileNo,
                String password,
                String role,
                String status,
                LocalDate registrationDateTime) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.role = role;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
    }

    public boolean signUp(int userId,
                          String fullName,
                          String email,
                          String mobileNo,
                          String password,
                          String role) {
        if (this.userId != userId || fullName == null || password == null || password.length() < 4) {
            return false;
        }
        this.fullName = fullName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.role = role;
        this.status = "Active";
        this.registrationDateTime = LocalDate.now();
        return true;
    }

    public boolean verifyLogin(int inputId, String inputPassword) {
        return this.userId == inputId
                && this.password != null
                && this.password.equals(inputPassword)
                && "Active".equalsIgnoreCase(this.status);
    }

    public void signOut() {
        System.out.println("User ID " + userId + " (" + fullName + ") signed out.");
    }

    // Abstract method overridden by subclasses
    public abstract void loadDashboard();

    public int getUserId() { return userId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getRegistrationDateTime() { return registrationDateTime; }
    public void setRegistrationDateTime(LocalDate registrationDateTime) { this.registrationDateTime = registrationDateTime; }
}


