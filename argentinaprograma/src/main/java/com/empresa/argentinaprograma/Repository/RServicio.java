package com.empresa.argentinaprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.argentinaprograma.Model.Servicio;

@Repository
public interface RServicio extends JpaRepository<Servicio, Long>{
    
}