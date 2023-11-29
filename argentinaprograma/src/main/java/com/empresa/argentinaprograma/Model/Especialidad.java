package com.empresa.argentinaprograma.Model;

import java.util.HashSet;
import java.util.Set;

public class Especialidad {
	
    private Long id;	
	
    private String nombre;
	
    private Set<Tecnico> tecnicos = new HashSet<>();
    
    public Especialidad() {
    }

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

	public Set<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(Set<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}  
    
    
}
