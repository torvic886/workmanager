package com.torvicsoft.workmanager.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import lombok.*;

@Entity
@Table(name = "maquinas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MaquinaTragamonedas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "fecha_instalacion")
    private LocalDate fechaInstalacion;

    @Column(name = "contador_inicial_in")
    private Integer contadorIn;

    @Column(name = "contador_inicial_out")
    private Integer contadorOut;

    @OneToMany(mappedBy = "maquina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Recaudo> recaudos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInstalacion() {
		return fechaInstalacion;
	}

	public void setFechaInstalacion(LocalDate fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}



	public Integer getContadorIn() {
		return contadorIn;
	}

	public void setContadorIn(Integer contadorIn) {
		this.contadorIn = contadorIn;
	}

	public Integer getContadorOut() {
		return contadorOut;
	}

	public void setContadorOut(Integer contadorOut) {
		this.contadorOut = contadorOut;
	}

	public List<Recaudo> getRecaudos() {
		return recaudos;
	}

	public void setRecaudos(List<Recaudo> recaudos) {
		this.recaudos = recaudos;
	}
    
    
    
}

