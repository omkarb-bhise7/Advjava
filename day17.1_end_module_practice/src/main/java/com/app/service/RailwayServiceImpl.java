package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.pojos.Railway;
import com.app.repository.RailwayRepository;

@Service
@Transactional
public class RailwayServiceImpl implements IRailwayService 
{
	//Dependency injection of DAO i/f Layer
	@Autowired
	private RailwayRepository railRepo;
	
	@Override
	public List<Railway> getAllRailways() 
	{
		return railRepo.findAll();
	}

	@Override
	public void addNewRailway(Railway transientRail) 
	{
		railRepo.save(transientRail);
	}

	@Override
	public void updateRailDetail(Railway detachedRail) 
	{
		//for update rail object is in detached state
		railRepo.save(detachedRail);
	}

	@Override
	public String deleteRail(Long id) 
	{
		String msg="Rail Id is invalid, cannot delete rail details...";
		if(railRepo.existsById(id))
		{
			railRepo.deleteById(id);
			return msg="Rail with Id : "+id+" is deleted successfully...";
		}
		else
			return msg;
	}

	@Override
	public Railway fetchRailDetails(Long id) 
	{
		return railRepo.findById(id).orElseThrow( ()->new ResourceNotFoundException("Invalid Rail Id, cann't able to fetch rail details...") );   
	}
	
	
	
	
	
}
