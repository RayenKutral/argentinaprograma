package com.empresa.argentinaprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.argentinaprograma.Model.Cliente;

@Repository
public interface RCliente extends JpaRepository<Cliente, Long> {

}
