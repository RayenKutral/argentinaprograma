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

import com.empresa.argentinaprograma.Model.Tecnico;
import com.empresa.argentinaprograma.Service.STecnico;

@RestController
public class CTecnico {
    
    private STecnico tecnico;  
 
    @Autowired
    public CTecnico(STecnico tecnico){
        this.tecnico = tecnico;
    }
    
    //CRUD BASICO
    @GetMapping (value = "/empresa/tecnicos", headers="Accept=application/json")
    @ResponseBody
    public List <Tecnico> mostrarTodos(){
        return this.tecnico.mostrarTodos();
    }
    
    @PostMapping (value = "/empresa/tecnicos/agregar", headers="Accept=application/json")
    public void agregarTecnico(@RequestBody Tecnico tecnico){
        this.tecnico.agregarTecnico(tecnico);
    }
    
    @GetMapping (value = "/empresa/tecnicos/{id}", headers="Accept=application/json")
    @ResponseBody
    public Optional<Tecnico> buscarTecnico(@PathVariable long id){
        return this.tecnico.buscarTecnico(id);
    }
    
    @DeleteMapping (value = "/empresa/tecnicos/eliminar/{id}", headers="Accept=application/json")
    public void eliminarTecnico (@PathVariable long id){
        this.tecnico.eliminarTecnico(id);
    }
    
    @PutMapping (value = "/empresa/tecnicos/actualizar/{id}", headers="Accept=application/json")
    public void modificarTecnico (@PathVariable long id, @RequestBody Tecnico tecnico){
        this.tecnico.modificarTecnico(id, tecnico);
    }    
 


    
}