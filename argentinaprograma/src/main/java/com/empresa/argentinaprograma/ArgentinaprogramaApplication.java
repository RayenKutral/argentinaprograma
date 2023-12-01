package com.empresa.argentinaprograma;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.empresa.argentinaprograma.Controller.CCliente;
import com.empresa.argentinaprograma.Controller.CIncidente;
import com.empresa.argentinaprograma.Controller.CServicio;
import com.empresa.argentinaprograma.Controller.CTecnico;
import com.empresa.argentinaprograma.Model.Cliente;
import com.empresa.argentinaprograma.Model.Incidente;
import com.empresa.argentinaprograma.Model.Servicio;
import com.empresa.argentinaprograma.Model.Tecnico;




	

	@SpringBootApplication
	public class ArgentinaprogramaApplication {

	    private static CTecnico cTecnico;
	    private static CCliente cCliente;
	    private static CIncidente cIncidente;
	    private static CServicio cServicio;

	    @Autowired
	    public ArgentinaprogramaApplication(CTecnico cTecnico, CCliente cCliente, CIncidente cIncidente, CServicio cServicio) {
	        ArgentinaprogramaApplication.cTecnico = cTecnico;
	        ArgentinaprogramaApplication.cCliente = cCliente;
	        ArgentinaprogramaApplication.cIncidente = cIncidente;
	        ArgentinaprogramaApplication.cServicio = cServicio;
	      
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(ArgentinaprogramaApplication.class, args);

	        int opcion;
	        do {
	            Menu.mostrarMenu();
	            opcion = Menu.leerOpcion();
	            procesarOpcion(opcion);
	        } while (opcion != 0);
	    }
	
	    	    
	    private static void procesarOpcion(int opcion) {
	        switch (opcion) {
	            case 1:
	                System.out.println("Agregar Técnico");
	                Tecnico nuevoTecnico = new Tecnico(1,41244325, "Omar Lopez", "omarlopez@gmail.com", "1156421662", "LINUX");

	                cTecnico.agregarTecnico(nuevoTecnico);
	                System.out.println("Técnico agregado correctamente.");
	                break;
	                
	            case 2:
	                System.out.println("Agregar Cliente");
	                Cliente nuevoCliente = new Cliente(1, 1234567, "CocaCola", 4);

	                cCliente.agregarCliente(nuevoCliente);
	                System.out.println("Cliente agregado correctamente.");
	                break;
	                
	            case 3:
	                System.out.println("Agregar Incidente");
	                Incidente nuevoIncidente = new Incidente(1, "blablabla1", "blablabla2", 52, "20/12/2029", "pendiente");

	                cIncidente.agregarIncidente(nuevoIncidente);
	                System.out.println("Incidente agregado correctamente.");
	                break;
	                
	            case 4:
	                System.out.println("Agregar Servicio");
	                 Servicio nuevoServicio = new Servicio(1, "TANGO");

	                cServicio.agregarServicio(nuevoServicio);
	                System.out.println("Servicio agregado correctamente.");
	                break;
	                
	            case 5:
	                System.out.println("Listado de Técnicos");
	             
	                List<Tecnico> tecnicos = cTecnico.mostrarTodos();
	                tecnicos.forEach(tecnico -> System.out.println(tecnico.toString()));
	                break;
	                
	            case 6:
	                System.out.println("Listado de Clientes");
	                List<Cliente> cliente = cCliente.mostrarClientes();
	                cliente.forEach(clientes -> System.out.println(clientes.toString()));
	                break;
	                
	            case 7:
	                System.out.println("Listado de Incidentes");
	                List<Incidente> incidente = cIncidente.mostrarTodos();
	                incidente.forEach(incidentes -> System.out.println(incidentes.toString()));
	                break;
	                
	            case 8: 
	            	System.out.println("Listado de Servicios");
                List<Servicio> servicio = cServicio.mostrarTodos();
                servicio.forEach(servicios -> System.out.println(servicios.toString()));
                break;
                
	            case 0:
	                System.out.println("Saliendo...");
	                break;
	                
	            default:
	                System.out.println("Opción no válida. Intente nuevamente.");
	                break;
	        }
	    }


	}