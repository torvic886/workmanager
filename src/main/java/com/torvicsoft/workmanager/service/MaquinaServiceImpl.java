package com.torvicsoft.workmanager.service;

import com.torvicsoft.workmanager.entity.MaquinaTragamonedas;
import com.torvicsoft.workmanager.repository.MaquinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaquinaServiceImpl implements MaquinaService {

    private final MaquinaRepository maquinaRepository;

    public MaquinaServiceImpl(MaquinaRepository maquinaRepository) {
        this.maquinaRepository = maquinaRepository;
    }

    @Override
    public List<MaquinaTragamonedas> findAll() {
        return maquinaRepository.findAll();
    }

    @Override
    public Optional<MaquinaTragamonedas> findById(Long id) {
        return maquinaRepository.findById(id);
    }

    @Override
    public MaquinaTragamonedas save(MaquinaTragamonedas maquina) {
        return maquinaRepository.save(maquina);
    }

    @Override
    public MaquinaTragamonedas update(Long id, MaquinaTragamonedas maquinaActualizada) {
        return maquinaRepository.findById(id)
                .map(maquina -> {
                    maquina.setNombre(maquinaActualizada.getNombre());
                    maquina.setContadorIn(maquinaActualizada.getContadorIn());
                    maquina.setContadorOut(maquinaActualizada.getContadorOut());
                    maquina.setFechaInstalacion(maquinaActualizada.getFechaInstalacion());
                    return maquinaRepository.save(maquina);
                }).orElseThrow(() -> new RuntimeException("Máquina no encontrada"));
    }

    @Override
    public void deleteById(Long id) {
        maquinaRepository.deleteById(id);
    }
}
