package com.empresa.argentinaprograma.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.argentinaprograma.Model.Servicio;
import com.empresa.argentinaprograma.Repository.RServicio;

@Service 
public class SServicio {
    
    @Autowired
    private final RServicio servicioRepo;
    @Autowired
    public SServicio(RServicio servicioRepo) {
        this.servicioRepo = servicioRepo;
    }
    
    
    //Crud basico
    public void agregarServicio(Servicio servicio){
        servicioRepo.save(servicio);
    }
    
    public void eliminarServicio(long id){
        servicioRepo.deleteById(id);
    }
    
    public Optional<Servicio> buscarIncidente(long id){
        return servicioRepo.findById(id);
    }
    
    public List <Servicio> mostrarTodos(){
        return servicioRepo.findAll();
    }
    
    public void modificarIncidente(Servicio servicio){
        
        servicioRepo.save(servicio);
    }
}