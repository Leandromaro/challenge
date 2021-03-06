package com.leandromaro.challenge.rest.persistence.respository;

import com.leandromaro.challenge.rest.persistence.domain.MeetUp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface MeetUpRepository extends CrudRepository<MeetUp, Long> {
	
	List<MeetUp> findAll();

}
