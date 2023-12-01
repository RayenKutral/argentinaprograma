package com.empresa.argentinaprograma.Model;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;




	@Entity
	@Getter @Setter
	public class Incidente {
	    
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
	    @Column(name = "fecha_registro", nullable=false, updatable=false)
	    @Temporal(TemporalType.DATE)
	    private String fechaRegistro = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	    @Column(name = "fecha_estimada_solucion", nullable = false, length = 10)
	    @Temporal (TemporalType.DATE)
	    private String fechaEstimadaSolucion;
	    private String estado;
	    @Column (name = "fecha_solucion", length = 10)
	    @Temporal (TemporalType.DATE)
	    private String fechaSolucion = null;

	    
	    public Incidente(long idIncidente, String tipoProblema, String descripcionProblema, long idTecnico, String fechaEstimadaSolucion, String estado) {
	        this.idIncidente = idIncidente;
	        this.tipoProblema = tipoProblema;
	        this.descripcionProblema = descripcionProblema;
	        this.idTecnico = idTecnico;
	        //En caso de que la fecha ingresada no sea valida, se ocupara un valor predeterminado de una semana
	        //Es decir la fecha de solucion estimada sera una semana despues de haber registrado el incidente
	        try{
	            this.fechaEstimadaSolucion=fechaEstimadaSolucion;   
	        }catch(Exception e){
	            this.fechaEstimadaSolucion=LocalDate.now().plusDays(7L).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	        }
	    }

	    @Override
	    public String toString() {
	        return String.format("Incidente[id=%d, "
	        		+ "Tipo Problema='%s', "
	        		+ "Descripcion Problema='%s', "
	        		+ "id Tecnico='%s', "
	        		+ "Fecha estimada solución='%s', "
	        		+ "Estado= '%s]",
	        
	        		
	                idIncidente, tipoProblema, descripcionProblema, idTecnico, fechaEstimadaSolucion, estado);
	    }
	    
	    public Incidente() {
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

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getFechaSolucion() {
			return fechaSolucion;
		}

		public void setFechaSolucion(String fechaSolucion) {
			this.fechaSolucion = fechaSolucion;
		}

	
	    
	    
	}