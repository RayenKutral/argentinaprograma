package com.empresa.argentinaprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.argentinaprograma.Model.IncidenteResuelto;

@Repository
public interface RIncidenteResuelto extends JpaRepository<IncidenteResuelto, Long>{
    
}