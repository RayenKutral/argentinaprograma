package com.empresa.argentinaprograma.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.argentinaprograma.Model.IncidenteResuelto;
import com.empresa.argentinaprograma.Repository.RIncidenteResuelto;

@Service
class SIncidentesResueltos {
    
	@Autowired
    private RIncidenteResuelto incidenteResueltoRepo;
    
    //Crud basico
   
    public void agregarIncidente(IncidenteResuelto incidente){
        incidenteResueltoRepo.save(incidente);
    }
    
    public void eliminarIncidente(long id){
        incidenteResueltoRepo.deleteById(id);
    }
    
    public Optional<IncidenteResuelto> buscarIncidente(long id){
        return incidenteResueltoRepo.findById(id);
    }
    
    public List <IncidenteResuelto> mostrarTodos(){
        return incidenteResueltoRepo.findAll();
    }
    
}
    
