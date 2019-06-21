package com.project.newpetclinic.services.springdatajpa;

import com.project.newpetclinic.model.Speciality;
import com.project.newpetclinic.repositories.SpecialityRepository;
import com.project.newpetclinic.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepositories;

    @Autowired
    public SpecialitySDJpaService(SpecialityRepository specialityRepositories) {
        this.specialityRepositories = specialityRepositories;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities=new HashSet<>();
        specialityRepositories.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        Optional<Speciality> optionalSpeciality= specialityRepositories.findById(aLong);
        return optionalSpeciality.orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepositories.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepositories.deleteById(aLong);
    }
}
