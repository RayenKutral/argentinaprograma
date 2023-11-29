package com.empresa.argentinaprograma.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.argentinaprograma.Model.Cliente;
import com.empresa.argentinaprograma.Repository.RCliente;

@Service 
public class SCliente {
    
    @Autowired
    private RCliente clienteRepo;
    
    //Crud basico
    public void agregarCliente(Cliente cliente){
        clienteRepo.save(cliente);
    }
    
    public void eliminarCliente(long id){
        clienteRepo.deleteById(id);
    }
    
    public Optional<Cliente> buscarCliente(long id){
        return clienteRepo.findById(id);
    }
    
    public List <Cliente> mostrarTodos(){
        return clienteRepo.findAll();
    }
    
    public void modificarCliente(long id, Cliente cliente){
        
        Cliente cli = this.clienteRepo.findById(id).orElse(cliente);
        cli.setCuit(cliente.getCuit());
        cli.setRazonSocial(cliente.getRazonSocial());        
        clienteRepo.save(cli);
    }
}