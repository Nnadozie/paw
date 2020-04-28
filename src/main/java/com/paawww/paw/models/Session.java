package com.paawww.paw.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    public Session() {
    }

    /**
     * @return Long return the session_id
     */
    public Long getSession_id() {
        return session_id;
    }

    /**
     * @param session_id the session_id to set
     */
    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    /**
     * @return String return the session_name
     */
    public String getSession_name() {
        return session_name;
    }

    /**
     * @param session_name the session_name to set
     */
    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    /**
     * @return String return the session_description
     */
    public String getSession_description() {
        return session_description;
    }

    /**
     * @param session_description the session_description to set
     */
    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    /**
     * @return Integer return the session_length
     */
    public Integer getSession_length() {
        return session_length;
    }

    /**
     * @param session_length the session_length to set
     */
    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }

}