package com.empresa.argentinaprograma.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servicio", nullable = false)
    private long idServicio;
    @Column(name = "tipo_problema", nullable = false, length = 50)
    private String nombre;

    public Servicio(long idServicio, String nombre) {
        this.idServicio = idServicio;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return String.format("Servicio[id=%d, "
        		+ "Nombre='%s']",
                idServicio,nombre);
    }

    public Servicio() {
    }

    
}
