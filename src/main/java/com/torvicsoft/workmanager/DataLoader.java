package com.torvicsoft.workmanager;

import com.torvicsoft.workmanager.entity.MaquinaTragamonedas;
import com.torvicsoft.workmanager.entity.Recaudo;
import com.torvicsoft.workmanager.repository.MaquinaRepository;
import com.torvicsoft.workmanager.repository.RecaudoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final MaquinaRepository maquinaRepository;
    private final RecaudoRepository recaudoRepository;

    public DataLoader(MaquinaRepository maquinaRepository, RecaudoRepository recaudoRepository) {
        this.maquinaRepository = maquinaRepository;
        this.recaudoRepository = recaudoRepository;
    }

    @Override
    public void run(String... args) {
        // Crear máquina tragamonedas
        MaquinaTragamonedas maquina = new MaquinaTragamonedas();
        maquina.setNombre("Máquina VIP 1");
        maquina.setContadorIn(5000);
        maquina.setContadorOut(15000);
        maquina.setFechaInstalacion(LocalDate.of(2024, 1, 10));

        maquina = maquinaRepository.save(maquina);

        // Crear recaudo
        Recaudo recaudo = new Recaudo();
        recaudo.setFecha(LocalDate.now());
        recaudo.setContadorInActual(6000);
        recaudo.setContadorOutActual(17000);
        recaudo.setDiferencia(11000);
        recaudo.setUtilidad(7000);
        recaudo.setMaquina(maquina);

        recaudoRepository.save(recaudo);

        System.out.println("✅ Datos de prueba insertados con éxito.");
    }
}
