package com.rulebook.test;

import com.deliveredtechnologies.rulebook.RuleState;
import com.deliveredtechnologies.rulebook.annotation.Given;
import com.deliveredtechnologies.rulebook.annotation.Result;
import com.deliveredtechnologies.rulebook.annotation.Rule;
import com.deliveredtechnologies.rulebook.annotation.Then;
import com.deliveredtechnologies.rulebook.annotation.When;
import java.util.ArrayList;
import java.util.List;

@Rule (order = 1)
public class ExampleRule1 {

    @Given
    private String status;

    @Result
    
    private List<AppointmentStatus> statusWillbe = new ArrayList<>();

    @When
    public boolean when() {
            return status.equals("pending");
    }

    @Then
    public RuleState then() {
     
        statusWillbe.add(AppointmentStatus.CANCELLED);
        statusWillbe.add(AppointmentStatus.SUSPENDED);
//        statusWillbe.add(AppointmentStatus.ERROR);
        return RuleState.BREAK;
    }
}
