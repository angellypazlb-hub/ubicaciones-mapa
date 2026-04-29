package com.neotropic.ubicaciones;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/ubicaciones")
@CrossOrigin(origins = "*")
public class UbicacionController {

    private final UbicacionRepository repository;

    public UbicacionController(UbicacionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Ubicacion> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Ubicacion> create(@RequestBody Ubicacion ubicacion) {
        Ubicacion saved = repository.save(ubicacion);
        return ResponseEntity.ok(saved);
    }
}