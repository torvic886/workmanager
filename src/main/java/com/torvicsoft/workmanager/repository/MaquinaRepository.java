package com.torvicsoft.workmanager.repository;

import com.torvicsoft.workmanager.entity.MaquinaTragamonedas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquinaRepository extends JpaRepository<MaquinaTragamonedas, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas
}

