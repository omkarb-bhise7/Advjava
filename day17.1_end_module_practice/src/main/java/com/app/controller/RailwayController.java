package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.pojos.Railway;
import com.app.service.IRailwayService;

@RestController
@RequestMapping("/railways")
public class RailwayController 
{
	//Dependacy Injection : Service Layer i/f
	@Autowired
	private IRailwayService railService;
	
	//constructor
	public RailwayController() 
	{
		System.out.println("In Railway Controller :: "+getClass());
	}
	
	@GetMapping
	public List<Railway> getAllRails()
	{
		return railService.getAllRailways();
	}
	
	@PostMapping
	public ResponseEntity<?> addRailDetails(@RequestBody Railway transientRail)
	{
		//for new Rail record rail object is in transient state
		railService.addNewRailway(transientRail);
		return new ResponseEntity<>("Rail details added successfully...", HttpStatus.CREATED);
	}
	
	@PutMapping
	public String updateRailwayDetails(@RequestBody Railway detachedRail)
	{
		railService.updateRailDetail(detachedRail);
		return "railway details Updated Successfully...";
	}
	
	@DeleteMapping("/{id}")
	public ApiResponse deleteRailwayDetails(@PathVariable Long id)
	{
		return new ApiResponse( railService.deleteRail(id) );
	}
	
	@GetMapping("/{id}")
	public Railway fetchRailwayDetails(@PathVariable Long id)
	{
		return railService.fetchRailDetails(id);
	}
	
}
