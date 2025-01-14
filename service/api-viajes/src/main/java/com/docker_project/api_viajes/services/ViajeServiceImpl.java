package com.docker_project.api_viajes.services;

import com.docker_project.api_viajes.model.Viaje;
import com.docker_project.api_viajes.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ViajeServiceImpl implements ViajeService{
    @Autowired
    private ViajeRepository repository;


    @Override
    public Viaje save(Viaje viaje) {
        return null;
    }

    @Override
    public Optional<Viaje> getViaje(long id) {
        return repository.findById((long) id);
    }

    @Override
    public void delete(long id){
        repository.deleteById((long) id);
    }


    @Override
    public void updateViaje(Viaje viaje) {
 repository.save(viaje);
    }
}
