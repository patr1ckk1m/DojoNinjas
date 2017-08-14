package com.patrick.dojoninja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patrick.dojoninja.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long>{

}
