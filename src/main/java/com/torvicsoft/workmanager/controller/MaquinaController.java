package com.torvicsoft.workmanager.controller;

import com.torvicsoft.workmanager.entity.MaquinaTragamonedas;
import com.torvicsoft.workmanager.service.MaquinaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maquinas")
public class MaquinaController {

    private final MaquinaService maquinaService;

    public MaquinaController(MaquinaService maquinaService) {
        this.maquinaService = maquinaService;
    }

    @GetMapping
    public ResponseEntity<List<MaquinaTragamonedas>> listarTodas() {
        return ResponseEntity.ok(maquinaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaquinaTragamonedas> obtenerPorId(@PathVariable Long id) {
        return maquinaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MaquinaTragamonedas> crear(@RequestBody MaquinaTragamonedas maquina) {
        return ResponseEntity.ok(maquinaService.save(maquina));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaquinaTragamonedas> actualizar(@PathVariable Long id, @RequestBody MaquinaTragamonedas maquina) {
        return ResponseEntity.ok(maquinaService.update(id, maquina));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        maquinaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
