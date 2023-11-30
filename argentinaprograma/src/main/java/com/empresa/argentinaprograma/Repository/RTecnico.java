package com.empresa.argentinaprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.argentinaprograma.Model.Tecnico;

@Repository 
public interface RTecnico extends JpaRepository<Tecnico, Long> {

}
