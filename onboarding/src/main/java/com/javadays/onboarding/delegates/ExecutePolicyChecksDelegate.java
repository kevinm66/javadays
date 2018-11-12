package com.javadays.onboarding.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ExecutePolicyChecksDelegate implements JavaDelegate{

	@Override
	public void execute (DelegateExecution execution) throws Exception {
		System.out.println("policy rules executed");
		//System.in.read();
	
}
}

