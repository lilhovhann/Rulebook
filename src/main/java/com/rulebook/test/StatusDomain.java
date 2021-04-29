package com.rulebook.test;

import java.util.ArrayList;
import java.util.List;


public class StatusDomain {

    private String statusIs;

    
    
    public AppointmentStatus[] getAppStatuses(){
        return AppointmentStatus.values();
    }
    
    
   

    public String getStatusIs() {
        return statusIs;
    }

    public void setStatusIs(String statusIs) {
        this.statusIs = statusIs;
    }

    
    
    
    
    
}
