package com.stockmarket.model;

public class User {
    private String fullname;
    private String emailid;
    private String username;
    private String password;
    private String aadhar;
    private String panno;
    private String mobile;
    private String address;
    private String status;
    
    // Constructors
    public User() {}
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Getters and Setters
    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }
    
    public String getEmailid() { return emailid; }
    public void setEmailid(String emailid) { this.emailid = emailid; }
    
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getAadhar() { return aadhar; }
    public void setAadhar(String aadhar) { this.aadhar = aadhar; }
    
    public String getPanno() { return panno; }
    public void setPanno(String panno) { this.panno = panno; }
    
    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
