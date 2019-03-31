package me.aravindh.sfgpetclinic.repositories;

import me.aravindh.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
