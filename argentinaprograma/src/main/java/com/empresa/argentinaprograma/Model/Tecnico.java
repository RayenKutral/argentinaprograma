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
public class Tecnico{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_empleado", nullable=false)
    private long idTecnico;
    @Column(name="dni", nullable=false, length = 8)
    private int dni;
    @Column(name="nombre", nullable=false, length = 50)
    private String nombre;
    @Column(name="email", nullable=false, length = 70)
    private String email;
    private String telefono;
    private String especialidad;

    public Tecnico(long idTecnico, int dni, String nombre, String email, String telefono, String especialidad) {
        this.idTecnico = idTecnico;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return String.format("Tecnico[id=%d, "
        		+ "dni='%s', "
        		+ "email='%s', "
        		+ "especialidad='%s', "
        		+ "nombre='%s', "
        		+ "telefono='%s']",
                idTecnico, dni, email, especialidad, nombre, telefono);
    }
    
    public Tecnico() {
    }

	public long getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


  
    
    
}