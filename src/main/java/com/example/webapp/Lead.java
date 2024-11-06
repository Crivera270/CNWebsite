package com.example.webapp;

import com.sun.istack.NotNull;
import jakarta.persistence.*;

@Entity
@Table(name = "leads", schema = "data")
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "FirstName", length = 30)
    private String firstName;

    @NotNull
    @Column(name = "LastName", length = 30)
    private String lastName;

    @NotNull
    @Column(name = "Email", length = 30)
    private String email;

    @NotNull
    @Column(name = "Message")
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}