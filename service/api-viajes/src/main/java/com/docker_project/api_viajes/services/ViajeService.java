package com.docker_project.api_viajes.services;

import com.docker_project.api_viajes.model.Viaje;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface ViajeService {
    public Viaje save(Viaje viaje);
    public Optional<Viaje> getViaje(long id);
    public void delete(long id);
    public void updateViaje(Viaje viaje);
}
