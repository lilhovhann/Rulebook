package com.rulebook.test;

/**
 *
 * @author user
 */
public enum AppointmentStatus {
    
    PROPOSED("proposed"),
    PENDING("pending"),
    CONFIRMED("confirmed"),
    ARRIVED("arrived"),
    COMPLETE("complete"),
    CANCELLED("cancelled"),
    SUSPENDED("suspended"),
    ERROR("error"),
    CHECKED_IN("checked-in"),
    WAITLIST("waitlist");
    
    private String key;

    private AppointmentStatus(String key) {
        this.key = key;
    }
    
    
    

}
