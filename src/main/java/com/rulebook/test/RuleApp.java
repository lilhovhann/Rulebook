package com.rulebook.test;

import com.deliveredtechnologies.rulebook.Fact;
import com.deliveredtechnologies.rulebook.runner.RuleBookRunner;
import org.apache.log4j.BasicConfigurator;

public class RuleApp {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        RuleBookRunner rulebook = new RuleBookRunner("com.rulebook.test");
      
        String applicant1 = new String("pending");
        rulebook.withDefaultResult(AppointmentStatus.ERROR).given(new Fact(applicant1)).run();
                
        System.out.println("=========> "+rulebook.getResult());
    }
}
