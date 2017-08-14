package com.patrick.dojoninja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.patrick.dojoninja.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long>{
	List<Ninja> findByDojo_id(Long id);
	
}
