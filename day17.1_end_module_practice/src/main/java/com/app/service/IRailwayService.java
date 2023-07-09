package com.app.service;

import java.util.List;
import com.app.pojos.Railway;

public interface IRailwayService 
{
	//add method to get all Railway Details
	public List<Railway> getAllRailways();
	
	//add method to add new railway details OR to update Existing railDetails
	public void addNewRailway(Railway transientRail);
	
	//add method to update existing rail records
	public void updateRailDetail(Railway detachedRail);
	
	//add method to delete existing rail details
	public String deleteRail(Long Id);
	
	//add method to get details of specific railway by Id
	public Railway fetchRailDetails(Long id);
	
}
