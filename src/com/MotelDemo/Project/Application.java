package com.MotelDemo.Project;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.HashMap;

import MotelDemoProject.CatergoryRequirements;

public class Application {
	
	ArrayList<CatergoryRequirements> categories = new ArrayList<CatergoryRequirements>();
	ArrayList<Service> services = new ArrayList<Service>();
	Hashmap<String, List<?>> tempMap = new HashMap<>();


	public static void main(String[] args) { 
		Application application= new Application();
		application.AddData();
		application.addServices();
		

	}
//AddServiceData
	public void addServices() {
		Service service1 = new Service(1, "a", 9.99f);
		Service service2 = new Service(1, "b", 8.99f);
		Service service3 = new Service(1, "c", 7.99f);
		Service service4 = new Service(1, "d", 6.99f);
		Service service5 = new Service(1, "e", 5.99f);
		services.add(service1);
		services.add(service2);
		services.add(service3);
		services.add(service4);
		services.add(service5);
		
	}
	
//AddData
	public void AddData() {
		CatergoryRequirements CatergoryRequirements = new CatergoryRequirements(1l, "bed",2, true, true, true, 2, 10.99f, 3.99f, true,true, true);
		Categories CatergoryRequirements1 = new CatergoryRequirements1 (1l, "bed",2, true, true, true, 2, 10.99f, 3.99f, true,true, true);
		Categories CatergoryRequirements2 = new CatergoryRequirements2
		Categories CatergoryRequirements3 = new CatergoryRequirements3
		Categories CatergoryRequirements4 = new CatergoryRequirements4
		
		categories.add(CatergoryRequirements)
		categories.add(CatergoryRequirements1)
		categories.add(CatergoryRequirements2)
		categories.add(CatergoryRequirements3)
		categories.add(CatergoryRequirements4)
	}
	
//Update
//Delete
	
}
