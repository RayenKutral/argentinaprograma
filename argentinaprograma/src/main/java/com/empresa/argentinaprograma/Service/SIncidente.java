package com.empresa.argentinaprograma.Service;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.empresa.argentinaprograma.Model.Incidente;
import com.empresa.argentinaprograma.Model.IncidenteResuelto;
import com.empresa.argentinaprograma.Repository.RIncidente;

@Service 
public class SIncidente {
    
    @Autowired
    private RIncidente rIncidente;
    
    @Autowired
    private SIncidentesResueltos sIncidenteResuelto;
    
    //Crud basico
    public void agregarIncidente(Incidente incidente){
    	rIncidente.save(incidente);
    }
    
    public void eliminarIncidente(long id){
    	rIncidente.deleteById(id);
    }
    
    public Optional<Incidente> buscarIncidente(long id){
        return rIncidente.findById(id);
    }
    
    public List<Incidente> mostrarTodos(){
        return rIncidente.findAll();
    }
    
    public void modificarIncidente(long id, Incidente incidente){
        
        if (Objects.nonNull(incidente.getFechaSolucion())){
            IncidenteResuelto incidenteResuelto = new IncidenteResuelto();
            
            incidenteResuelto.setTipoProblema(incidente.getTipoProblema());
            incidenteResuelto.setDescripcionProblema(incidente.getDescripcionProblema());
            incidenteResuelto.setIdTecnico(incidente.getIdTecnico());
            incidenteResuelto.setFechaRegistro(incidente.getFechaRegistro());
            incidenteResuelto.setFechaEstimadaSolucion(incidente.getFechaEstimadaSolucion());
            incidenteResuelto.setFechaSolucion(incidente.getFechaSolucion());
            
            this.rIncidente.deleteById(id);
            this.sIncidenteResuelto.agregarIncidente(incidenteResuelto);
            
        }
        else{
            Incidente incidenteAux = this.rIncidente.findById(id).orElse(null);            
            incidenteAux.setTipoProblema(incidente.getTipoProblema());
            incidenteAux.setDescripcionProblema(incidente.getDescripcionProblema());
            incidenteAux.setIdTecnico(incidente.getIdTecnico());
            incidenteAux.setFechaRegistro(incidente.getFechaRegistro());
            incidenteAux.setFechaEstimadaSolucion(incidente.getFechaEstimadaSolucion());
            
            this.rIncidente.save(incidenteAux);
        
    }
}
}