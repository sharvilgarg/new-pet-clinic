package com.project.newpetclinic.bootstrap;

import com.project.newpetclinic.model.Owner;
import com.project.newpetclinic.model.Vet;
import com.project.newpetclinic.services.OwnerService;
import com.project.newpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService=ownerService;
        this.vetService=vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Geneva");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Green");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jess");
        vet2.setLastName("Potter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
