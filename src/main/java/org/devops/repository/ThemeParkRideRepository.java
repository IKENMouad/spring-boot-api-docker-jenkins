package org.devops.repository;

import java.util.List;

import org.devops.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeParkRideRepository  extends CrudRepository<ThemeParkRide, Long>   {
 
	
	List<ThemeParkRide> findByName(String name) ;
	
	
	
}
