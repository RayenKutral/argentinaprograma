package com.empresa.argentinaprograma.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class IncidenteResuelto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_incidente", nullable = false)
    private long idIncidente;
    @Column(name = "tipo_problema", nullable = false, length = 50)
    private String tipoProblema;
    @Column(name = "descripcion_problema", nullable = false, length = 150)
    private String descripcionProblema;
    @Column(name = "id_tecnico", nullable = false)
    private long idTecnico;
    @Column(name = "fecha_registro", updatable=false ,nullable = false, length = 10)
    @Temporal(TemporalType.DATE)
    private String fechaRegistro;
    @Column(name = "fecha_estimada_solucion", nullable = false, length = 10)
    @Temporal (TemporalType.DATE)
    private String fechaEstimadaSolucion;
    @Column (name = "fecha_solucion", length = 10)
    @Temporal (TemporalType.DATE)
    private String fechaSolucion;

    public IncidenteResuelto(Incidente incidente, String fechaSolucion) {
        this.idIncidente = incidente.getIdIncidente();
        this.tipoProblema = incidente.getTipoProblema();
        this.descripcionProblema = incidente.getDescripcionProblema();
        this.idTecnico = incidente.getIdTecnico();
        this.fechaRegistro = incidente.getFechaRegistro();
        this.fechaEstimadaSolucion = incidente.getFechaEstimadaSolucion();   
    
        try{
            this.fechaSolucion=fechaSolucion;   
        }catch(Exception e){
            this.fechaSolucion = null;
        }
    }
    
    

    public IncidenteResuelto () {
    }

	public long getIdIncidente() {
		return idIncidente;
	}

	public void setIdIncidente(long idIncidente) {
		this.idIncidente = idIncidente;
	}

	public String getTipoProblema() {
		return tipoProblema;
	}

	public void setTipoProblema(String tipoProblema) {
		this.tipoProblema = tipoProblema;
	}

	public String getDescripcionProblema() {
		return descripcionProblema;
	}

	public void setDescripcionProblema(String descripcionProblema) {
		this.descripcionProblema = descripcionProblema;
	}

	public long getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaEstimadaSolucion() {
		return fechaEstimadaSolucion;
	}

	public void setFechaEstimadaSolucion(String fechaEstimadaSolucion) {
		this.fechaEstimadaSolucion = fechaEstimadaSolucion;
	}

	public String getFechaSolucion() {
		return fechaSolucion;
	}

	public void setFechaSolucion(String fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}
    
    
    
}