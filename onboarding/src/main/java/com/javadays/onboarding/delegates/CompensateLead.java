package com.javadays.onboarding.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CompensateLead implements JavaDelegate{
	
	@Override
	public void execute (DelegateExecution execution) throws Exception {
		String name = (String) execution.getVariable("firstName");
		System.out.println("lead " + name+ " created");
		//System.in.read();
	throw new RuntimeException(); 
		
	}

}
