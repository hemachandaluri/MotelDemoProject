package com.MotelDemo.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import MotelDemoProject.BookingRoomReq;
import MotelDemoProject.BookingServiceReq;
import MotelDemoProject.CatergoryRequirements;
import MotelDemoProject.EmployeeReq;
import MotelDemoProject.EmployeeTracking;
import MotelDemoProject.GuestDetailsreq;
import MotelDemoProject.Service;

public class Application {

	ArrayList<CatergoryRequirements> categories = new ArrayList<CatergoryRequirements>();
	ArrayList<Service> services = new ArrayList<Service>();
	ArrayList<EmployeeReq> ER = new ArrayList<EmployeeReq>();
	ArrayList<EmployeeTracking> ET = new ArrayList<EmployeeTracking>();
	ArrayList<GuestDetailsreq> GR = new ArrayList<GuestDetailsreq>();
	ArrayList<BookingRoomReq> BRR = new ArrayList<BookingRoomReq>();
	ArrayList<BookingServiceReq> BSR = new ArrayList<BookingServiceReq>();

	HashMap<String, List<?>> tempMap = new HashMap<>();

	/*
	 * Create method and pass list and return the even data list
	 * 
	 */

	public static void main(String[] args) {
		Application application = new Application();
		application.AddData();
		application.addServices();
		//String tempValue = application.returnGivenNumber(10);
		//System.out.println("value from givenMethod :: " + tempValue);

	}

	
	  public List<Service> evenDatalist(ArrayList<Service> temp) {
		 /**For each ASerice in the list 
		  * Wee return listand add required service to that list
		  * 
		  * 
		  */
		  
		  //return result list
		  ArrayList<Service> mServices = new ArrayList<Service>();	
		  
		  //iterate over each service in temp
		  for(Service service: temp) {
			  //logic for checking if service ID is even
			  if(service.getService_id()%2==0) {
				  mServices.add(service);
			  }
			  
		  }
		  
		  //return result
		  return mServices;
	  }

	  public List<String> getPrices(ArrayList<Service> services){
		  ArrayList<String> prices = new ArrayList<>();
		  for(Service service: services) {
			  prices.add(Float.toString(service.getPrice()));
		  }
		  
		  return prices;
	  }
	 

/*	public String returnGivenNumber(int value) {
		return value+1+"";
	}*/

//AddServiceData
	public void addServices() {
		Service service1 = new Service(1l, "a", 9.99f);
		Service service2 = new Service(2l, "b", 8.99f);
		Service service3 = new Service(3l, "c", 7.99f);
		Service service4 = new Service(4l, "d", 6.99f);
		Service service5 = new Service(5l, "e", 5.99f);
		services.add(service1);
		services.add(service2);
		services.add(service3);
		services.add(service4);
		services.add(service5);
		for (Service s : services) {
			if (s.getService_id() % 2 == 1)
				System.out.println("The odd service Ids are" + s);
		}

	}

//AddData
	public void AddData() {
		CatergoryRequirements cat1 = new CatergoryRequirements(1l, "bed", 2, true, true, true, 2, 10.99f, 3.99f, true,
				true, true);
		CatergoryRequirements cat2 = new CatergoryRequirements(2l, "bed", 3, true, true, true, 2, 20.99f, 3.99f, true,
				true, true);
		CatergoryRequirements cat3 = new CatergoryRequirements(3l, "bed", 4, true, true, true, 2, 30.99f, 3.99f, true,
				true, true);
		CatergoryRequirements cat4 = new CatergoryRequirements(4l, "bed", 5, true, true, true, 2, 40.99f, 3.99f, true,
				true, true);
		CatergoryRequirements cat5 = new CatergoryRequirements(5l, "bed", 6, true, true, true, 2, 50.99f, 3.99f, true,
				true, true);

		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		categories.add(cat4);
		categories.add(cat5);
		for (CatergoryRequirements cr : categories) {
			if (cr.getId() % 2 == 0)
				System.out.println("The even Caterory IDs are " + cr);

		}
	}

//Edit and get
//Delete and get

}
