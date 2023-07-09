package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.pojos.Railway;

public interface RailwayRepository extends JpaRepository<Railway, Long> 
{
	
}
