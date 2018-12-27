package com.spring.ctech.petclinic.service;

import com.spring.ctech.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}
