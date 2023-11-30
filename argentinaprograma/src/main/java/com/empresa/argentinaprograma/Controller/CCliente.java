package com.empresa.argentinaprograma.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.argentinaprograma.Model.Cliente;
import com.empresa.argentinaprograma.Service.SCliente;

@RestController
public class CCliente{
    
    private SCliente cliente;
    
    @Autowired
    public CCliente (SCliente cliente){
        this.cliente = cliente;
    }
    
    //CRUD basico
    @GetMapping(value = "/emrpesa/clientes", headers="Accept=application/json") 
    @ResponseBody
    public List <Cliente> mostrarClientes (){
        return this.cliente.mostrarTodos();
    }
    
    @PostMapping (value = "/empresa/clientes/agregar", headers="Accept=application/json")
    public String agregarCliente (@RequestBody Cliente cliente){
        this.cliente.agregarCliente(cliente);
        return "Cliente creado";
    }
    
    @GetMapping (value = "/empresa/clientes/{id}", headers="Accept=application/json")
    @ResponseBody
    public Optional<Cliente> mostrarCliente (@PathVariable long id){
        return this.cliente.buscarCliente(id);
    }
    
    @PutMapping (value = "/empresa/clientes/actualizar/{id}", headers="Accept=application/json")
    public void modificarCliente (@PathVariable long id, @RequestBody Cliente cliente){
        this.cliente.modificarCliente(id, cliente);
    }
    
    @DeleteMapping (value = "/empresa/clientes/eliminar/{id}", headers="Accept=application/json")
    public void eliminarCliente (@PathVariable long id){
        this.cliente.eliminarCliente(id);
    }
}