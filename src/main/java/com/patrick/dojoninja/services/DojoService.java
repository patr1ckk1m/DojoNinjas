package com.patrick.dojoninja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patrick.dojoninja.models.Dojo;
import com.patrick.dojoninja.models.Ninja;
import com.patrick.dojoninja.repositories.DojoRepo;
import com.patrick.dojoninja.repositories.NinjaRepo;

@Service
public class DojoService {
	private DojoRepo dojoRepo;
	private NinjaRepo ninjaRepo;
	
	public DojoService(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	public List<Dojo> findDojos(){
		return (List<Dojo>) dojoRepo.findAll();
	}
	
	public Dojo findDojo(Long id) {
		return dojoRepo.findOne(id);
	}
	
	public List<Ninja> findNinjasByDojo(long id){
		return ninjaRepo.findByDojo_id(id);
	}
}
