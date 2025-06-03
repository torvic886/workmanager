package com.torvicsoft.workmanager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "recaudos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recaudo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private Integer contadorInActual;
    private Integer contadorOutActual;

    private Integer diferencia;
    private Integer utilidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maquina_id", nullable = false)
    private MaquinaTragamonedas maquina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getContadorInActual() {
		return contadorInActual;
	}

	public void setContadorInActual(Integer contadorInActual) {
		this.contadorInActual = contadorInActual;
	}

	public Integer getContadorOutActual() {
		return contadorOutActual;
	}

	public void setContadorOutActual(Integer contadorOutActual) {
		this.contadorOutActual = contadorOutActual;
	}

	public Integer getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(Integer diferencia) {
		this.diferencia = diferencia;
	}

	public Integer getUtilidad() {
		return utilidad;
	}

	public void setUtilidad(Integer utilidad) {
		this.utilidad = utilidad;
	}

	public MaquinaTragamonedas getMaquina() {
		return maquina;
	}

	public void setMaquina(MaquinaTragamonedas maquina) {
		this.maquina = maquina;
	}
    
    
    
}
