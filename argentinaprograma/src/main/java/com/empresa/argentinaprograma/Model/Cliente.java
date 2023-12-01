package com.empresa.argentinaprograma.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente", nullable=false)
    private long idCliente;
    @Column(name = "cuit", nullable=false, length = 12)
    private long cuit;
    @Column(name = "razon_social", nullable=false, length = 70 )
    private String razonSocial; 
    @Column (name = "id_sericio", nullable = false)
    private long idServicio;

    public Cliente(long idCliente, int cuit, String razonSocial, long idServicio) {
        this.idCliente = idCliente;
        this.cuit = cuit;
        this.razonSocial = razonSocial;    
        this.idServicio = idServicio;
    }

    @Override
    public String toString() {
        return String.format("Cliente[id=%d, "
        		+ "cuit='%s',"
        		+ " Razón social='%s',"
        		+ " id Servicio='%s']",        		
                idCliente, cuit, razonSocial, idServicio);
    }
    
    public Cliente() {
    }

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public long getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(long idServicio) {
		this.idServicio = idServicio;
	}


}
