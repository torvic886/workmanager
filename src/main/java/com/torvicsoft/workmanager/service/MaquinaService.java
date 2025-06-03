package com.torvicsoft.workmanager.service;

import com.torvicsoft.workmanager.entity.MaquinaTragamonedas;

import java.util.List;
import java.util.Optional;

public interface MaquinaService {
    List<MaquinaTragamonedas> findAll();
    Optional<MaquinaTragamonedas> findById(Long id);
    MaquinaTragamonedas save(MaquinaTragamonedas maquina);
    MaquinaTragamonedas update(Long id, MaquinaTragamonedas maquinaActualizada);
    void deleteById(Long id);
}
