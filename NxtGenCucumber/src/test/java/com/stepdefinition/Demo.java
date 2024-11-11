package com.stepdefinition;

import java.io.PrintWriter;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {

	@Given("Test the data table")
	public void test_the_data_table() {
		System.out.println("Test started");

	}

	@When("multiple data is passed")
	public void multiple_data_is_passed(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> l = dataTable.asLists();
		System.out.println(l.get(0).get(0));
		System.out.println(l.get(0).get(1));

	}

	@Then("store the data")
	public void store_the_data() {
		System.out.println("Test ended");
	}

}
