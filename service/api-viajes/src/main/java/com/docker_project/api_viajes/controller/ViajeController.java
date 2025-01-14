package com.docker_project.api_viajes.controller;

import com.docker_project.api_viajes.model.Viaje;
import com.docker_project.api_viajes.services.ViajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/viajes")
public class ViajeController {
    @Autowired
    private ViajeServiceImpl viajeService;


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Viaje>> getViajeById(@PathVariable Long id) {
        return ResponseEntity.ok(viajeService.getViaje(id));
    }
//    @GetMapping("/{id}")
//    public String showViajes(){
//        return viajeService.getViaje(@PathVariable long id)
//    }
    @GetMapping("/create")
    public String create(){
        return "viajes/create";
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Viaje>> deleteViaje(@PathVariable Long id) {
        viajeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Optional<Viaje>> createProduct(@RequestBody Viaje viaje) {
        return ResponseEntity.ok(Optional.ofNullable(viajeService.save(viaje)));
    }
}
