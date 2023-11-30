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

import com.empresa.argentinaprograma.Model.Incidente;
import com.empresa.argentinaprograma.Service.SIncidente;

@RestController
public class CIncidente {
    
    private SIncidente incidente;
    
    @Autowired
    public CIncidente(SIncidente incidente){
        this.incidente = incidente;
    }
    
    //CRUD basico
    @GetMapping(value = "/empresa/incidentes", headers="Accept=application/json") 
    @ResponseBody
    public List<Incidente> mostrarIncidente(){
        return this.incidente.mostrarTodos();
    }
    
    @PostMapping (value = "/empresa/incidentes/agregar", headers="Accept=application/json")
    public String agregarIncidente (@RequestBody Incidente incidente){
        this.incidente.agregarIncidente(incidente);
        return "Incidente creado";
    }
    
    @GetMapping (value = "/empresa/incidentes/{id}", headers="Accept=application/json")
    @ResponseBody
    public Optional<Incidente> mostrarIncidente (@PathVariable long id){
        return this.incidente.buscarIncidente(id);
    }
    
    @PutMapping (value = "/empresa/incidentes/actualizar/{id}", headers="Accept=application/json")
    public void modificarIncidente (@PathVariable long id, @RequestBody Incidente incidente){
        this.incidente.modificarIncidente(id, incidente);
    }
    
    @DeleteMapping (value = "/empresa/incidentes/eliminar/{id}", headers="Accept=application/json")
    public void eliminarIncidente (@PathVariable long id){
        this.incidente.eliminarIncidente(id);
    }

	public List<Incidente> mostrarTodos() {	
	        return this.incidente.mostrarTodos();
	}
}
