package com.patientregistrationservice.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "REGISTRATION_TB")
public class Patient {

    @Column(name = "user_name")
    private String username;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @NotEmpty(message = "First name cannot be null and must have size greater
    // than 0")

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    // @Id
    // @Column(name = "user_name")
    // private String Username;

    // @Email(message = "Email should be valid")
    // @NotNull
    @Column(name = "email_id")
    private String email;

    // @Min(value = 8)
    // @Pattern(regexp = "^[a-zA-Z0-9]{6,10}$")
    @Column(name = "password")
    private String pass;

    @Column(name = "DOB")
    private String dob;

    // @Min(value = 10)
    // @Max(value = 10)
    @Column(name = "phone_no")
    private String phone;
    @Column(name = "created_by")
    private String createdby;
    @Column(name = "updated_by")
    private String updatedby;
    @Column(name = "created_date")
    private String cdate;
    @Column(name = "updated_date")
    private String upDate;
    private String role;

    public Patient() {
    }

    public Patient(String username, String firstname, String lastname, String email, String pass, String dob,
            String phone, String createdby, String updatedby, String cdate, String upDate, String role) {
        super();
        this.username = username;

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.pass = pass;
        this.dob = dob;
        this.phone = phone;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.cdate = cdate;
        this.upDate = upDate;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return lastname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getcreatedby() {
        return createdby;
    }

    public void setcreatedby(String cratedby) {
        this.createdby = cratedby;
    }

    public String getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getUpDate() {
        return upDate;
    }

    public void setUpDate(String upDate) {
        this.upDate = upDate;
    }

    @Override
    public String toString() {
        return "PatientDetails [cdate=" + cdate + ", createdby=" + createdby +
                ", dob=" + dob + ", email=" + email
                + ", firstname=" + firstname + ", id=" + id + ", lastname=" + lastname +
                ", pass=" + pass + ", phone="
                + phone + ", upDate=" + upDate + ", updatedby=" + updatedby + "]";
    }

}
