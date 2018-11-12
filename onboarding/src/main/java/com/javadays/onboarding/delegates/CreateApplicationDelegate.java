package com.javadays.onboarding.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CreateApplicationDelegate implements JavaDelegate {
	
	@Override
	public void execute (DelegateExecution execution) throws Exception {
		System.out.println("application created");
		execution.setVariable("applicationUid", "12345678");
		//System.in.read();
		
	}

}
