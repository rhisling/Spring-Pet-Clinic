package me.aravindh.sfgpetclinic.repositories;

import me.aravindh.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
