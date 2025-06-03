package com.torvicsoft.workmanager.repository;

import com.torvicsoft.workmanager.entity.Recaudo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecaudoRepository extends JpaRepository<Recaudo, Long> {
    List<Recaudo> findByMaquinaId(Long maquinaId); // trae recaudos por máquina
}
