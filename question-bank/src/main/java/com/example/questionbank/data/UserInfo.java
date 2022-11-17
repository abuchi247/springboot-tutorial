package com.example.questionbank.data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "userinfo")
public class UserInfo implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "roles", nullable = false)
    private String roles;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    public UserInfo() {
    }

    public UserInfo(String username, String password, String roles) {
        this.username = username;
        this.password = password;
        this.active = true;
        this.roles = roles;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean isActive() {
        return active;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userId=" + userId + '\'' +
                "active=" + active + '\'' +
                "roles=" + roles + '\'' +
                "username=" + username + '\'' +
                "password=" + password + '\'' +
                '}';
    }
}
