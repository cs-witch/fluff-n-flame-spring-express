package com.launchacademy.adaptapet.respositories;

import com.launchacademy.adaptapet.models.PetTypes;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PetTypesRepository extends PagingAndSortingRepository<PetTypes, Integer > {

}
