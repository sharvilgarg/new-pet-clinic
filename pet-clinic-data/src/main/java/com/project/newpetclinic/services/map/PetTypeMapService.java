package com.project.newpetclinic.services.map;

import com.project.newpetclinic.model.PetType;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
   public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
