package com.docker_project.api_viajes.repository;

import com.docker_project.api_viajes.model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViajeRepository extends JpaRepository<Viaje, Long> {
}
