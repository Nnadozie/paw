package com.paawww.paw.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "userData")
public class UserDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userID;

    @Size(min = 3, max = 20)
    private String name;

    @Size(min = 3, max = 20)
    private String lastName;

    private char[] password;

    private Integer numberOfCircles;

    

    /**
     * @return Integer return the userID
     */
    public Integer getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return char[] return the password
     */
    public char[] getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(char[] password) {
        this.password = password;
    }

    /**
     * @return Integer return the numberOfCircles
     */
    public Integer getNumberOfCircles() {
        return numberOfCircles;
    }

    /**
     * @param numberOfCircles the numberOfCircles to set
     */
    public void setNumberOfCircles(Integer numberOfCircles) {
        this.numberOfCircles = numberOfCircles;
    }

}