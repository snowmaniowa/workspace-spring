package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

//DAO / Impl
public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();		
		Activity act1 = new Activity();
		act1.setDescription("Running");
		act1.setDuration(45);
		activities.add(act1);		
		Activity act2 = new Activity();
		act2.setDescription("Swimming");
		act2.setDuration(30);
		activities.add(act2);		
		return activities;
	}
	
	@Override
	public Activity findActivity(String activityId){
		Activity act1 = new Activity();		
		User user = new User();
		if(activityId.equals("100")){
			act1.setDescription("Bikingggggggggggggggggggg");
			act1.setDuration(120);
			user.setId(1);
			user.setName("Ramu");
		} else if(activityId.equals("200")){
			act1.setDescription("Sky Diving..");
			act1.setDuration(15);
			user.setId(2);
			user.setName("Somu");
		} else {
			act1.setDescription("NA");
			act1.setDuration(0);			
		}
		act1.setUser(user);
		return act1;
	}

	
	@Override
	public User findActivityUser(String activityId){
		return findActivity(activityId).getUser();					
	}

	@Override
	public void create(Activity activity) {
		// TODO Auto-generated method stub
		
	}
	
}
