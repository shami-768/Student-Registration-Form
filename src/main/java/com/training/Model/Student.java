package com.training.Model;

import javax.validation.constraints.*;
import java.sql.Date;

public class Student {
    @NotNull(message = "Id is Required")
    @Min(value = 1,message = "Id cannot be Zero or Negative")
    private Integer id;
    @NotBlank(message = "Name cannot be Blank")
    private String name;
    @NotBlank(message = "City cannot be Blank")
    private String city;
    @NotBlank(message = "Department cannot be Blank")
    private String dept;
    @Pattern(regexp = "\\d{10}",message = "Phone Number cannot be less then 10 digits")
    private String phno;
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid Email")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String  phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
