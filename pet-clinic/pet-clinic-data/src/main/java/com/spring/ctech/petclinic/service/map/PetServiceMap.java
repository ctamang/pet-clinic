package com.spring.ctech.petclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.spring.ctech.petclinic.model.Owner;
import com.spring.ctech.petclinic.service.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

}
