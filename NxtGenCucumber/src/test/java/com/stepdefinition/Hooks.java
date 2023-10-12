package com.stepdefinition;


import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	StepDefinition action;
	@Before
	public void preAction() throws IOException
	{
		System.out.println("Pre action performed");
		action = new StepDefinition();
		action.user_launches_the_application();
		action.user_navigate_to_demo_sites();
		action.naviagte_to_practice_automation();
	}
	@After
	public void postAction()
	{
		System.out.println("Post action performed");
		action = new StepDefinition();
		action.close_the_application();

	}
}
