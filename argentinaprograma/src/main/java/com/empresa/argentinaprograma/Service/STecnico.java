package com.empresa.argentinaprograma.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.argentinaprograma.Model.Tecnico;
import com.empresa.argentinaprograma.Repository.RTecnico;

@Service  
public class STecnico {
    
    @Autowired 
    private final RTecnico rTecnico;
    @Autowired
    public STecnico(RTecnico rTecnico) {
        this.rTecnico = rTecnico;
    }
    
    //Crud basico
    public void agregarTecnico(Tecnico tecnico){
   
        rTecnico.save(tecnico);
    }
    
    
    public void eliminarTecnico(long id){
        rTecnico.deleteById(id);
    }
    
    public Optional<Tecnico> buscarTecnico(long id){
        return rTecnico.findById(id);
    }
    
    public List<Tecnico> mostrarTodos(){
        return rTecnico.findAll();
    }
    
    public void modificarTecnico(long id, Tecnico tecnico){
        
        Tecnico tecnicoAux = this.rTecnico.findById(id).orElse(tecnico);
        
        tecnicoAux.setDni(tecnico.getDni());
        tecnicoAux.setNombre(tecnico.getNombre());
        tecnicoAux.setEmail(tecnico.getEmail());
        tecnicoAux.setTelefono(tecnico.getTelefono());
        
        rTecnico.save(tecnico);
    }
}